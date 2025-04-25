public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int result = sol.solution(new int[] {10, 8, 6}, 3);
        System.out.println("Solution : "+result);
    }
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        System.out.println("상자의 크기가 가로" + box[0] + ",세로" + box[1] +", 높이" + box[2] + " 이므로 모서리의 길이가" +
               n + "인 주사위는" + answer + "개 들어 갈 수 있습니다 ");
        return answer ;
    }
}