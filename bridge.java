import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bridge {
    static int[][] memo = new int[200][200];

    public static int combination(int n, int r) {
        if (n == r || r == 0) return 1;
        if (memo[n][r] != 0) return memo[n][r]; // 이미 계산했으면 바로 반환
        return memo[n][r] = combination(n - 1, r - 1) + combination(n - 1, r); // 저장하면서 반환
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 서쪽 사이트 수
            int M = Integer.parseInt(st.nextToken()); // 동쪽 사이트 수

            int min = Math.min(N, M);
            int max = Math.max(N, M);

            sb.append(combination(max, min)).append("\n");
        }

        System.out.print(sb);
    }
}
