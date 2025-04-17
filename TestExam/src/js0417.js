class Exam27 {
    maps = new Map();

    inputFunc() {
        let names = prompt("이름을 공백으로 구분하여 입력하세요.");
        let score = prompt("점수를 공백으로 구분하여 입력하세요.");
        let arrName = names.split(" ");
        let arrScore = score.split(" ");
        if (arrName.length != arrScore.length) {
            alert("두개 배열의 길이가 다릅니다. 다시 시작하세요.");
            return false;   // 함수가 false 를 리턴한다.
        }
        for(let i = 0; i < arrName.length; i++){
            this.maps.set(arrName[i], Number(arrScore[i]));
        }// 이미 두 배열의 길이가 같은지 다른지 확인했기 때문에 한 배열의 길이만큼만 반복하여도 결과를 출력가능하다.
        console.log(this.maps);
        return true;    // 함수가 true 를 리턴한다.
    }

    outputFunc() {
        let strOutput = "{";
        for( let item of this.maps ) {
            console.log(item);
            strOutput += `'${item[0]}': ${item[1]}, `
        }
        strOutput = strOutput.substring(0 , strOutput.length - 2);
        // 문자열의 길이에서 -2 시킨 길이의 문자열로 다시 저장. "abcd" => "ab"
        strOutput += "}";
        console.log(strOutput);
    }
}

let exam = new Exam27();
if ( exam.inputFunc() ) {   // inputFunc() 를 실행하고 리턴값이 true 이면
    exam.outputFunc();  // outputFunc() 를 실행한다.
}

class Ex28{
    strInput = "";
    constructor(str) {
        this.strInput = str;
    }
    output(){
        let ArrStr = [];
        ArrStr = this.strInput.split("");

        for (let i = 0; i < ArrStr.length-1; i++){
            console.log(ArrStr[i] + " " + ArrStr[i+1] + "\n");
        }

        console.log();
    }
}

let exam2 = new Ex28(prompt("문자를 입력하세요."));
exam2.output();

class Exam37 {
    arrItem = [];
    maps = new Map();
    constructor(input) {
        this.arrItem = input.split(" ");
    }
    checkVotes() {
        // 배열에 루프를 실행하여 검색해본다.
        for( let i = 0; i < this.arrItem.length; i++ ) {
            if ( this.maps.has(this.arrItem[i]) === true) {
                // map 에 원소이름의 키가 있을때 실행한다.
                let number = this.maps.get(this.arrItem[i]);
                // map 에서 원소이름이 키인 원래값을 가져온다.
                this.maps.set(this.arrItem[i], number + 1);
                // map 에 {원소이름: 원래값+1} 으로 저장 한다
                // this.maps.set( 키, 값 );
            } else {
                // map 에 원소이름의 키가 없을때 실행한다.
                this.maps.set(this.arrItem[i], 1);
                // map 에 {원소이름: 1} 으로 저장 한다
                // this.maps.set( 키, 값 );
            }
        }
        console.log(this.maps);
        console.log([...this.maps]);    // [... JavaScript Map, Set, Array] ===> 배열로 변환
        let item = [...this.maps].reduce( (a,b) =>  // Array reduce 사용
            a[1] >= b[1] ? a : b    // 앞의 원소 a[1] 값 >= 뒤의 원소 b[1] 값 보다 크면 a 를 리턴
        );
        return item;
        // return 가장 [1] 값이 큰 map 원소를 리턴한다.
    }
    // isExistItem(item) {
    //     // 원소가 maps 에 키로 존재하면 true 를 리턴한다.
    //     return
    //     // if ( this.maps.has(item) == true )
    // }
}
// 원범 혜원 유빈 원범 혜원 곰 유빈 원범 곰 혜원 호랑이 혜원
let exam37 = new Exam37(prompt("투표할 항목을 공백으로 구분해서 입력하세요."));
let result = exam37.checkVotes();
console.log(`투표 결과 ${result[0]}가 ${result[1]}표로 가장 많습니다.`);
