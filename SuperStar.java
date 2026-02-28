import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SuperStar {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");
        List<String> winners = new ArrayList<>();
        List<Double> scores = new ArrayList<>();
        float sum = 0;

        int M = Integer.parseInt(T[0]); // 참가자 수
        int N = Integer.parseInt(T[1]); // 장르
        int K = Integer.parseInt(T[2]); // 본선 진출
        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {

            String[] line = br.readLine().split(" ");
            int maxKey = 0;
            double maxValue = Double.NEGATIVE_INFINITY;

            for (int j = 0; j < M; j++) {
                if(j == 0) {
                    if(!map.containsKey(line[j])) {
                        map.put(line[j], Double.parseDouble(line[j+1]));
                    } else {
                        if(map.get(line[j]) < Double.parseDouble(line[j+1])) {
                            map.put(line[j], Double.parseDouble(line[j+1]));
                        }
                    }
                } else {
                    if(!map.containsKey(line[j*2])) {
                        map.put(line[j*2], Double.parseDouble(line[j*2+1]));
                    } else {
                        if(map.get(line[j*2]) < Double.parseDouble(line[j*2+1])) {
                            map.put(line[j*2], Double.parseDouble(line[j*2+1]));
                        }
                    }
                }
            }
        }

        scores = new ArrayList<>(map.values());
        Collections.sort(scores, Collections.reverseOrder());

        for (int i = 0; i < K; i++) {
            sum += scores.get(i);
        }

        System.out.printf("%.1f", sum);
    }
}
