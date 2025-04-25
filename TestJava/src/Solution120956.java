public class Solution120956 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120956
    public static void main(String[] args) {
        Solution120956 sol = new Solution120956();
        int result = sol.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println("Solution120956 : " + result);
    }
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            String strBabbling =  String.valueOf(babbling[i]);
            strBabbling = strBabbling.split("")[0];
            if(babbling[i].equals("a")) {}
        }

        return answer;
    }
}
