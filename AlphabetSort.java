import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AlphabetSort {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        List<String> alphabetArr = new ArrayList<>();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String N = st.nextToken(); // 서쪽 사이트 수

            if (!alphabetArr.contains(N)) {
                alphabetArr.add(N);
            }
        }

        alphabetArr.sort((String s1, String s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });

        for (int i = 0; i < alphabetArr.size(); i++) {
            System.out.println(alphabetArr.get(i));
        }
    }
}
