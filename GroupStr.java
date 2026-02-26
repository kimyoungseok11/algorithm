import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStr {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        int countYn = 0;
        int count = 0;


        for (int i = 0; i < N; i++) {
            String st = br.readLine();
            Map<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < st.length(); j++) {
                if (!map.containsKey(st.charAt(j))) {
                    map.put(st.charAt(j), j);
                } else {
                    int idx = map.get(st.charAt(j));

                    if ((idx + 1) != j) {
                        break;
                    } else {
                        map.put(st.charAt(j), j);
                    }
                }
            }

            if(Collections.max(map.values()) == st.length() - 1) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
