import java.util.Arrays;

public class OneMaker {
    private static int solution(String nk) {
        int result = 0;

        int[] sNk = Arrays.stream(nk.split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = sNk[0];
        int k = sNk[1];

        while (n > 1) {
            if(n % k == 0) {
                n /=k;
            } else {
                n -= 1;
            }
            result += 1;
        }

        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        solution("25 5");   
    }
}
