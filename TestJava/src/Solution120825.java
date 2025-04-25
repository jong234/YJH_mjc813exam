public class Solution120825 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120825
    public static void main(String[] args) {
        Solution120825 sol = new Solution120825();
        String result = sol.solution("hello", 3);
        System.out.println("Solution120825 : " + result);
    }
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
