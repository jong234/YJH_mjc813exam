package com.yjh.bandgroup.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableScheduling
public class SpringtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtestApplication.class, args);
    }


    @RestController
    class TestController {
        @GetMapping("/test")
        public String test() {
            return "Hello World";
        }
    }

    @Component
    class WebhookTask {
        private final RestTemplate restTemplate = new RestTemplate();

        private final String webhookUrl = "https://discord.com/api/webhooks/1437781267536941159/a7icm8GkBsc8F5Led9Q66LYlli5c_97iaaVpBG9ZW6XBatDtcS2otfwCGbFdSuQVkSaT";

        private final String targetUrl = "http://localhost:8086";

        @Scheduled(fixedRate = 3600000)
        public void checkHealthAndNotify() {

            try {
                restTemplate.getForObject((String) targetUrl, String.class);
                System.out.println("✅ 서버살아있다...: " + targetUrl);
            } catch (RestClientException e) {
                sendWebhook("🚨 ALERT: 서버 응답없음! 확인 필요!\n```\n" + e.getMessage() + "\n```",
                        (String) webhookUrl);
            }

        }

        private void sendWebhook(String message, String url) {
            try {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);

                Map<String, String> payload = new HashMap<>();
                payload.put("content", message);

                HttpEntity<Map<String, String>> request = new HttpEntity<>(payload, headers);
                String response = restTemplate.postForObject(url, request, String.class);
                System.out.println("Webhook response: " + response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
