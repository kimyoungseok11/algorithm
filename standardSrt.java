import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class standardSrt {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String N = st.nextToken(); // 서쪽 사이트 수

            if(N.length() == 1) {
                sb.append(N + "" + N).append("\n");
            } else {
                sb.append(N.charAt(0) + "" + N.charAt(N.length() -1)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
