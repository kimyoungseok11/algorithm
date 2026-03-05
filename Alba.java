import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Alba {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> tips = new ArrayList<>();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int tip = Integer.parseInt(br.readLine());
            tips.add(tip);
        }

        tips.sort((Integer t1, Integer t2) -> {
            return t2 - t1;
        });

        for (int i = 0; i < tips.size(); i++) {
            int order = i;
            int tip = tips.get(i) - (order);

            if(tip >= 0) {
                sum += tip;
            }
        }

        System.out.println(sum);
    }
}
