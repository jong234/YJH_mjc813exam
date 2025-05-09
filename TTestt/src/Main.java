public class Main {
    public static void main(String[] args) {
        String my_string = "Hello";
        int n = 3;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(my_string.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
class Main2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
class Main3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a + b < 100) {
           a = (int) (Math.random() * 6 + 1);
           b = (int) (Math.random() * 6 + 1);
           if (a + b  == 5) {
               System.out.println(a + "," + b);
               break;
           }
           System.out.println(a + "," + b);
        }
    }
}
class Main4 {
    public static void main(String[] args) {

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if(4 * x + 5 * y == 60 ){
                    System.out.println(x + "," + y);
                }
            }
        }
    }
}