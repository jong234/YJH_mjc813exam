class Exam0414{
    makeLotto(){
        Math.random();
        let arrLotto = [];
        for(let i=0; i<6; i++){
            let nRd = Math.floor(Math.random() * 45) + 1;
            if(!this.existNumber(nRd,arrLotto)){
                arrLotto.push(nRd);
            }else{
                i--;
            }
        }
        arrLotto.sort((a,b) => {return a-b});
        console.log(`makeLotto : ${arrLotto}`);
    }
    existNumber(number, arry){
      let result =  arry.some(function (item){
          return item === number;
        });
    return result;
    }


    test10problem(){


    }

}
let exam0414 = new Exam0414();
exam0414.makeLotto();