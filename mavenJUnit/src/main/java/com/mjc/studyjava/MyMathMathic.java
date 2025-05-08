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
}