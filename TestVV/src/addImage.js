import Cat from "./cat.jpg";

function addImage(){
    const img =document.createElement('img');
    img.width = '200';
    img.src = Cat;
    img.alt = "이미지 없음";

    const body = document.querySelector('body');
    body.appendChild(img);
}

export default addImage;