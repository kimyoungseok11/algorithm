import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AlphabetSort {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        List<String> alphabetArr = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String word = br.readLine();
            if(!alphabetArr.contains(word)) {
                alphabetArr.add(word);
            }
        }

        alphabetArr.sort((String s1, String s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        for (int i = 0; i < alphabetArr.size(); i++) {
            System.out.print(alphabetArr.get(i) + "\n");
        }
    }
}
