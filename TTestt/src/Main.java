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