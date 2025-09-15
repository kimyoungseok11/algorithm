import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Squeez {
    public static int[] solution(String msg) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int nextNUm = 27;

        for (int i = 0; i < 26; i++) {
            int c = 65 + i;
            String alphabet = "" + (char) c;
            
            map.put(alphabet, i + 1);
        }

        for (int i = 0; i < msg.length();) {
            String w = "" + msg.charAt(i);
            int j = i + 1;

            while (j <= msg.length()) {
                String tmp = msg.substring(i, j);

                if (map.containsKey(tmp)) {
                    w = tmp;
                    j++;
                } else {
                    break;
                }
            }

            answerList.add(map.get(w));

            if(j <= msg.length()) {
                map.put(msg.substring(i, j), nextNUm);
                nextNUm += 1;
            }

            i = i + w.length();
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        String msg = "KAKAO";
        solution(msg);
    }
}
