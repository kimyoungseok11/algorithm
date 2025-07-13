import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Process {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<Integer> process = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        List<Integer> list = new ArrayList<>();

        for (int num : priorities) {
            list.add(num);
        }

        int max = Arrays.stream(priorities).max().getAsInt();

        for (int i = 0; i < priorities.length; i++) {
            String alphabet = String.valueOf((char) ('A' + i));
            queue.offer(alphabet);
        }

        while (queue.size() > 0) {
            String alphabet = queue.poll();
            int ascii = alphabet.charAt(0) - 65;

            if(priorities[ascii] != max) {
                queue.offer(alphabet);
            } else {
                priorities[ascii] = 0;
                max = Arrays.stream(priorities).max().getAsInt();
                process.add(ascii);
            }
        }

        for (int i = 0; i < process.size(); i++) {
            System.out.println(process.get(i));
            if (process.get(i) == location) {
                answer = i+1;
            }
        }

        System.out.println(answer);
        
        return answer;
    }

    public static void main(String[] args) {
        int[] properties =  {2, 1, 3, 2};

        solution(properties, 2);
    }
}
