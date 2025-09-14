import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Squeez {
    public static int[] solution(String msg) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int nextIndex = 27;

        for(int i = 0; i < 26; i++) {
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        for (int i = 0; i < msg.length();) {
            String w = "" + msg.charAt(i);
            int j = i + 1;

            // 2. 사전에 있는 가장 긴 w 찾기
            while (j <= msg.length()) {
                String candidate = msg.substring(i, j);
                if (map.containsKey(candidate)) {
                    w = candidate;
                    j++;
                } else {
                    break;
                }
            }
            
            // 3. w의 색인 출력
            answerList.add(map.get(w));
            // 4. 사전에 w+c 추가 (c는 w 다음 글자)
            if (j <= msg.length()) {
                map.put(msg.substring(i, j), nextIndex++);
            }
            i += w.length(); // w 길이만큼 인덱스 이동
        }
        return answer;
    }
    public static void main(String[] args) {
        String msg = "KAKAO";
        solution(msg);
    }
}
