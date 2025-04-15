const loto = [];

for(let i=0; i< 6; i++) {
    const ramdom = Math.floor(Math.random()*Math.ceil(45));
    loto.push(ramdom);
}
console.log(loto);// 첫 공백은 줄 개수의 -1 개 만큼 생성 공백이 1개 씩 줄어들때 마다 별은 2개씩 늘어남


class Wizard {
    health = "";
    mana = "";
    armor = "";
    constructor(health, mana, armor) {
        this.health = health;
        this.mana = mana;
        this.armor = armor;
    }
    attack() {
        console.log("파이어 볼");
    }
}

class Ex10 {
    test10() {
        let str = 2;
        let num = 5;
        let resultblk = "";

        for (let i = 0; i < num; i++) {
            resultblk += "";
            for (let b = num - i; b > 1; b--) {
                resultblk += " ";
            }
            for (let s = 1; s < str; s++) {
                resultblk += "*";
            }
            str += 2
            resultblk += "\n"
        }
        console.log(resultblk);
    }

    test12(){
        const x = new Wizard(545, 210, 10);
        console.log(x.health, x.mana, x.armor);
        x.attack();
    }

    test13(){
        let str = ["수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"];
        let strInput = prompt("입력하세요");

        switch (strInput)
        {
            case "1" : console.log(str[0]);break;

            case "2" : console.log(str[1]);break;

            case "3" : console.log(str[2]);break;

            case "4" : console.log(str[3]);break;

            case "5" : console.log(str[4]);break;

            case "6" : console.log(str[5]);break;

            case "7" : console.log(str[6]);break;

            case "8" : console.log(str[7]);break;
        }
    }
    test16(){
        let text = "거꾸로";
        let textArrangement = [];
        let result = "";

        textArrangement = String.prototype.split(text);
        result = textArrangement.join();
        console.log(result);
    }
}
let Exresult1 = new Ex10();
Exresult1.test10();
let Exresult2 = new Ex10();
Exresult2.test12();
let Exresult3 = new Ex10();
Exresult3.test13();
let Exresult4 = new Ex10();
Exresult4.test16();