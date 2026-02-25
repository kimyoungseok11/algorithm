import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Atm {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        List<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort((s1, s2) -> s1 - s2);

        for (int i = 0; i <= arr.size(); i++) {
            int time = 0;
            for (int j = 0; j < i; j++) {
                time = time + arr.get(j);
            }
            result += time;
        }

        System.out.println(result);
    }
}
