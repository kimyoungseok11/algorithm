import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringDiif {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");

        String word1 = T[0];
        String word2 = T[1];

        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i <= word2.length() - word1.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < word1.length(); j++) {
                if(word1.charAt(j) != word2.charAt(i + j)) {
                    cnt += 1;
                }
            }
            sums.add(cnt);
        }

        System.out.println(Collections.min(sums));
    }
}
