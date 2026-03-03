import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GuitarLine {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");

        int N = Integer.parseInt(T[0]);
        int M = Integer.parseInt(T[1]);
        int money = 0;

        List<Integer> packages = new ArrayList<>();
        List<Integer> individualPrices = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] brand = br.readLine().split(" ");
            int packagePrice = Integer.parseInt(brand[0]);
            int individualPrice = Integer.parseInt(brand[1]);

            packages.add(packagePrice);
            individualPrices.add(individualPrice);
        }

        packages.sort((p1, p2) -> p1 - p2);
        individualPrices.sort((i1, i2) -> i1 - i2);

        int minPackage = packages.get(0);
        int minIndividual = individualPrices.get(0);

        // 6개를 사는 최소 비용(패키지 1개 vs 낱개 6개)
        int packCostFor6 = Math.min(minPackage, minIndividual * 6);

        while (N > 0) {
            if (N >= 6) {
                money += packCostFor6;
                N -= 6;
            } else {
                // 남은 건 (남은 개수 낱개로) vs (패키지 1개 더)
                money += Math.min(N * minIndividual, minPackage);
                N = 0;
            }
        }

        System.out.println(money);
    }
}