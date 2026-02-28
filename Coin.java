import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Coin {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");
        int count = 0;

        int N = Integer.parseInt(T[0]);
        int K = Integer.parseInt(T[1]);
        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(br.readLine());
            coins.add(coin);
        }

        coins.sort((Integer i, Integer j) -> {
            return j - i;
        });

        for (int i = 0; i < coins.size(); i++) {
            int divine = K / coins.get(i);
            count += divine;
            K = K % coins.get(i);
        }

        System.out.println(count);
    }
}
