package com.mjc.studyjava;

import java.math.BigDecimal;
import java.util.Random;

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
        if(a == null || b == null) {
            return false;
        }
            return a.equals(b) ? true : false;

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
        if(a == null) {
            return 0;
        }
        return Integer.parseInt(a, 10);
    }
    public int avg(int [] arry){
        int sum = 0;

        if(arry == null){
            return 0;
        }

        for(int i = 0; i < arry.length; i++){
            sum += arry[i];
        }
        Integer result = sum / arry.length;


            return result.intValue();
    }
    public int sum(int [] arry){
        int sum1 = 0;
        if(arry == null){
            return 0;
        }
        for(int i = 0; i < arry.length; i++){
            sum1 += arry[i];
        }
        return sum1;
    }
    public int sumOfNumber(int [] arry, int number){
        int sum = 0;
        if(arry == null){
            return 0;
        }
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
    public BigDecimal getBigDecimal(int n, int s){
    // s의 길이가 3이면 1000으로 나누기
        String result = "";
       BigDecimal a = new BigDecimal(n);
       BigDecimal b = new BigDecimal(s);
       BigDecimal c = new BigDecimal("0.1");
       BigDecimal d = new BigDecimal("0.1");
       BigDecimal zero = new BigDecimal("0");
       BigDecimal MinOne = new BigDecimal("-1");
       int resultMinuse = a.compareTo(zero);
       int resultMinuse1 = b.compareTo(zero);
        for(int i = 0; i <= String.valueOf(s).length() - 2 ; i++){
         c = c.multiply(d);
       }
        b = b.multiply(c);
        if(resultMinuse < 0 ){
           a = a.multiply(MinOne);
           a = a.add(b);
          return a = a.multiply(MinOne);

        } else if ( resultMinuse1 < 0) {
            b = b.multiply(MinOne);
            a = a.add(b);
            return a.multiply(MinOne);
        }else{
          return a = a.add(b);
        }
    }
    public Integer[] getIntegerArray(int[] n){
        if(n == null){
            return null;
        }
        Integer[] a = new Integer[n.length];
        for(int i = 0; i < n.length; i++){
            a[i] = n[i];
        }
        return a;
    }
    public int[] makeRandomIntArray(int n){
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] += (int)(Math.random()* 100 +1);
        }
        return a;
    }
    public String makeEncryptString(String text, int n){
        if(text == null){
            return "";
        }
        String charRandom = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder();//n =5 text.length = 5 result.length = 6(n + 1) * 5 = 30

        for(int i = 0; i < text.length(); i++){

          if(i == 0){
              for(int j = 0; j < n; j++){
                  int index = rand.nextInt(charRandom.length());
                  result.append(charRandom.charAt(index));
              }
          }
          else{
              for(int j = 0; j < n-1; j++){
                    int index = rand.nextInt(charRandom.length());
                    result.append(charRandom.charAt(index));
                }
            }
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    String makeDecryptString(String code, int n){
        if (code == null){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for(int i = 1; i < code.length(); i++){
                if (i % n == 0) {
                    result.append(code.charAt(i));
                }
            }
        return result.toString();
    }
}