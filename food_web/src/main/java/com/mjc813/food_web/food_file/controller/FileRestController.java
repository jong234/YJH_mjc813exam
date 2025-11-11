package com.mjc813.food_web.food_file.controller;

import com.mjc813.food_web.common.CommonRestController;
import com.mjc813.food_web.common.MyFileUtil;
import com.mjc813.food_web.common.ResponseCode;
import com.mjc813.food_web.common.ResponseDto;
import com.mjc813.food_web.common.dto.FileRestResponseDto;
import com.mjc813.food_web.common.exception.MyRequestException;
import com.mjc813.food_web.food.dto.FoodIngsResponseDto;
import com.mjc813.food_web.food.service.FoodJpaTransactionService;
import com.mjc813.food_web.food_category.dto.FoodCategoryDto;
import com.mjc813.food_web.food_file.dto.FoodFileEntity;
import com.mjc813.food_web.food_file.service.FoodFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
public class FileRestController extends CommonRestController {
    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private FoodFileService foodFileService;

    @Autowired
    private FoodJpaTransactionService foodJpaTransactionService;

    private MyFileUtil mju = new MyFileUtil();

    @PostMapping(value = "/api/v1/rest/file", consumes = "multipart/form-data")
    public ResponseEntity<ResponseDto> upload(@RequestPart(name = "foodCategoryDto", required = true) FoodCategoryDto dto
            , @RequestPart(name = "fileList", required = false) List<MultipartFile> files
    ) {
        List<String> result = new ArrayList<>();
        try {
            if( dto == null ) {
                return this.getReponseEntity(ResponseCode.REQUEST_FAIL, "request fail", null, new MyRequestException("dto request error"));
            }
            log.debug("upload.FoodCategoryDto = {}", dto);
            log.debug("upload.files = {}", files.size());

            Resource resource = resourceLoader.getResource("classpath:static/images");
            String uploadDir = resource.getFile().getPath();
            for ( MultipartFile mf : files ) {
                if ( mf == null || Objects.requireNonNull(mf.getOriginalFilename()).isEmpty() ) {
                    continue;
                }
                Path copyLocation = Paths.get(uploadDir + "/" + mf.getOriginalFilename());
                Files.copy(mf.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
                result.add(mf.getOriginalFilename());
            }
        } catch (Throwable e) {
            log.error(e.toString());
        }
        FileRestResponseDto frrd = new FileRestResponseDto();
        frrd.setFoodCategoryDto(dto);
        frrd.setFiles(result);
        return this.getReponseEntity(ResponseCode.SUCCESS, "ok", frrd, null);
    }

    @GetMapping("/download_food_file")
    public ResponseEntity<ByteArrayResource> downloadFoodFile(@RequestParam Long id) {
        try{
            if ( id == null || id <= 0 ) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentLength(0).body(null);
            }
            FoodFileEntity find = this.foodFileService.findById(id);
            byte[] bytes = this.mju.getBytesFile(find.getRealName());
            ByteArrayResource resource = new ByteArrayResource(bytes);
            return ResponseEntity
                    .ok()
                    .contentLength(bytes.length)
                    .header("Content-type", "application/octet-stream")
                    .header("Content-disposition", "attachment; filename=\"" + URLEncoder.encode(find.getName(), StandardCharsets.UTF_8) + "\"")
                    .body(resource);
        } catch (Exception ex) {
            log.error(ex.toString());
            return ResponseEntity.status(500).contentLength(0).body(null);
        }
    }

    @GetMapping("/api/v1/main")
    public ResponseEntity<ResponseDto> getMainData() {
        try {
            List<FoodIngsResponseDto> all = this.foodJpaTransactionService.getFoodsAndIngredientList();
            return this.getReponseEntity(ResponseCode.SUCCESS, "ok", all, null);
        } catch ( Throwable e ) {
            return this.getReponseEntity(ResponseCode.SELECT_FAIL, "error", null, e);
        }
    }

    @GetMapping("/view_food_file/{id}")
    public ResponseEntity<Resource> viewFoodFile(@PathVariable Long id) {
        try{
            if ( id == null || id <= 0 ) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentLength(0).body(null);
            }
            FoodFileEntity find = this.foodFileService.findById(id);

            Path filePath = Paths.get(find.getDir()).resolve(find.getRealName()).normalize();
            Resource resource = new UrlResource(filePath.toUri());

//            String contentType = Files.probeContentType(resource.getFile().toPath());
            String contentType = "image/" + find.getExt();
            return ResponseEntity
                    .ok()
                    .header("Content-type", contentType)
                    .body(resource);
        } catch (Exception ex) {
            log.error(ex.toString());
            return ResponseEntity.status(500).contentLength(0).body(null);
        }
    }
}
