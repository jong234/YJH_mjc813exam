package com.mjc.studyjava;

public class MyMathMathic {
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public long mul(int a, int b){
        return (long) a * b;
    }
    public int divM(int a, int b){
        return a / b;
    }
    public int divN(int a, int b){
        return a % b;
    }
    public boolean same(int a,int b){
        return a == b ? true : false;
    }
    public boolean same(String a, String b){
        return a.equals(b) ? true : false ;
    }
    public boolean notSame(int a, int b){
        return a != b ? true : false;
    }
    public boolean big(int a,int b){
        return  a > b ? true : false;
    }
    public boolean small(int a,int b){
        return a < b ? true : false;
    }
    public int shiftLeft(int a,byte b){
        return a << b;
    }
    public int shiftRight(int a, byte b){
        return a >> b;
    }
    public int shiftRight0(int a, byte b){
        return a >>> b;
    }
    public long square(int a, byte b){
        long c = a;
        for(int i = 0; i < b-1; i++ ){
            c *= a;
        }
        return c;
    }
    public int absolute(int a){
        return a < 0 ? -a : a;
    }
    public String toHex(int a){
        return Integer.toHexString(a);
    }
    public String toBin(int a){

        return Integer.toBinaryString(a);
    }
    public String toOct(int a){
        return Integer.toOctalString(a);
    }
    public int toDec(String a){
        return Integer.parseInt(a, 10);
    }
    public int avg(int [] arry){
        int sum = 0;
        for(int i = 0; i < arry.length; i++){
            sum += arry[i];
        }
        return sum / arry.length;
    }
    public int sum(int [] arry){
        int sum1 = 0;
        for(int i = 0; i < arry.length; i++){
            sum1 += arry[i];
        }
        return sum1;
    }
    public int sumOfNumber(int [] arry, int number){
        int sum = 0;
        for(int i = 0; i < arry.length; i++){
            if(arry[i] % number == 0){
               sum += arry[i];
            }
        }
        return sum;
    }
    public int sumOfLoop(int a, int b){
        int sum = 0;
       for(int i = 0; i <= b; i++){
           if(i < a){
               continue;
           }
           sum += i;
       }
       //a부터 b까지 더하기 a = 2 b = 5면  2+3+4+5 까지
        return sum;
    }
    public int sumOfFav(int a, int b) {
        int sum = 0;
        if (a == b) {
            return sum + b;
        } else if (sum == 0) {
            return (sum + a) + sumOfFav(a + 1, b);
        }
        return sum;
    }
}