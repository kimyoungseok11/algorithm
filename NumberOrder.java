import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] T = br.readLine().split(" ");
        int N = Integer.parseInt(T[0]);
        int K = Integer.parseInt(T[1]);
        long sum = 0;
        List<Long> sums = new ArrayList<>();

        String[] temps = br.readLine().split(" ");

        for (int i = 0; i < K; i++) {
            sum += Integer.parseInt(temps[i]);
        }

        sums.add(sum);

        for(int i = 1; i <= N - K; i++) {
            int firstNum = Integer.parseInt(temps[i - 1]);
            int lastNum = Integer.parseInt(temps[i + K - 1]);
            sum = sum - firstNum + lastNum;
            sums.add(sum);
        }

        System.out.println(Collections.max(sums));
    }
}
