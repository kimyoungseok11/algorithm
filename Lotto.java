import java.util.ArrayList;
import java.util.List;

public class Lotto {

    public static int rank(int numCount) {
        int answer = 0;

        if(numCount == 6) {
            answer = 1;
        } else if(numCount == 5) {
            answer = 2;
        } else if(numCount == 4) {
            answer = 3;
        } else if(numCount == 3) {
            answer = 4;
        } else if(numCount == 2) {
            answer = 5;
        } else{
            answer = 6;
        }

        return answer;
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int sameCount = 0;
        int zeros = 0;
        
        List<Integer> list = new ArrayList<>();

        for (int num : win_nums) {
            list.add(num);
        }

        for (int i = 0; i < lottos.length; i++) {
            if(list.contains(lottos[i])) {
                sameCount++;
            };

            if(lottos[i] == 0) {
                zeros++;
            }
        }

        System.out.println(rank(zeros+sameCount) + " " + rank(sameCount));

        int[] answer = {0,0};

        answer[0] = rank(zeros+sameCount);
        answer[1] = rank(sameCount);

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] nums = {31, 10, 45, 1, 6, 19};

        solution(lottos, nums);
    }
}
