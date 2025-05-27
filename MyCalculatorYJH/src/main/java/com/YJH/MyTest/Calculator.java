package com.YJH.MyTest;

public class Calculator {
    int a, b, result;
    int[] a1;
    public int add(int a, int b) {
        this.a = a;
        this.b = b;

        result = a + b;
      return result;
    }

    public int sub(int a, int b) {
        this.a = a;
        this.b = b;

        result = a - b;
       return result;
    }

    public int mul(int a, int b) {
        this.a = a;
        this.b = b;

        result = a * b;
       return result;
    }
    public int div(int a, int b) {
        this.a = a;
        this.b = b;

        result = a / b;
        return result;
    }
    public int mod(int a, int b) {
        this.a = a;
        this.b = b;

        result = a % b;
       return result;
    }

    public int square(int a , int b) {
        this.a = a;
        this.b = b;
        this.result = a;

        while (b-1 > 0){
           this.result *= a;
            b--;
        }
        return result;
    }

    public int arrangementSum(int[] a1) {
        this.a1 = a1;
        this.result = 0;

        for (int i = 0; i < a1.length; i++) {
            this.result += a1[i];
        }

     return result;
    }
}

