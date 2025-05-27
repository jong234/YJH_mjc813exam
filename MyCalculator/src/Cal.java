public class Cal {
    int a, b, result;
    int[] a1;
    void add(int a, int b) {
        this.a = a;
        this.b = b;

        result = a + b;
        System.out.printf("더하기 결과 %d\n", result);
    }

    void sub(int a, int b) {
        this.a = a;
        this.b = b;

        result = a - b;
        System.out.printf("빼기 결과 %d\n", result);
    }

    void mul(int a, int b) {
        this.a = a;
        this.b = b;

        result = a * b;
        System.out.printf("곱하기 결과 %d\n", result);
    }
    void div(int a, int b) {
        this.a = a;
        this.b = b;

        result = a / b;
        System.out.printf("나누기 결과 몫은 %d\n", result);
    }
    void mod(int a, int b) {
        this.a = a;
        this.b = b;

        result = a % b;
        System.out.printf("나누기 결과 나머지는 %d\n", result);
    }

    void square(int a , int b) {
        this.a = a;
        this.b = b;

        while (b > 0){
            result = a * a;
            b--;
        }
        System.out.printf("%d의 %d제곱은 %d입니다.\n", a, b, result);
    }

    void arrangementSum(int[] a1) {
        this.a1 = a1;
        for (int i = 0; i < a1.length; i++) {
            result += a1[i];
        }

        System.out.printf("배열의 합은 %d\n", result);

    }
}
