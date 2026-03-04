import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class OnlineSell {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");

        int N = Integer.parseInt(T[0]); //달걀 개수
        int M = Integer.parseInt(T[1]); //고객 수
        List<Integer> prices = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int price = Integer.parseInt(br.readLine());
            prices.add(price);
        }

        prices.sort((Integer i1, Integer i2) -> {
            return i2 - i1;
        });

        for(int i = 0; i < prices.size(); i++) {
            int sum = 0;
            int count = 0;
            for(int j = 0; j < prices.size(); j++) {
                if(prices.get(i) <= prices.get(j)) {
                    if(count != N) {
                        count += 1;
                        sum += prices.get(i);
                    } else {
                        break;
                    }

                }
            }
            map.put(prices.get(i), sum);
        }

        Map.Entry<Integer, Integer> maxEntry = Collections.max(
                map.entrySet(),
                Map.Entry.comparingByValue()
        );

        System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());
    }
}
