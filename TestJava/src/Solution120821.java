import java.util.*;
import java.util.ArrayList;

public class Solution120821 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120821
    public static void main(String[] args) {
        Solution120821 sol = new Solution120821();
        int[] result = sol.solution(new int[] {1, 0, 1, 1, 1, 3, 5});
        System.out.println("Solution120821 : " + Arrays.toString(result));
    }
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
         for (int i = 0; i < num_list.length; i++) {
          answer[i] = num_list[num_list.length - 1 - i];
        }

        return answer;
    }

}
