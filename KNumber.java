import java.util.ArrayList;
import java.util.Arrays;

public class KNumber {
    public static int solution(int n, int k) {
        String binary = Integer.toString(n,k);
        String[] binaryArr = binary.split("0");
        ArrayList<String> binaryList = new ArrayList<>(Arrays.asList(binaryArr));
        
        binaryList.removeIf(item -> item.equals(""));

        int answer = 0;

        for(int i = 0; i < binaryList.size(); i++) {
            long intValue = Long.parseLong(binaryList.get(i));
            if(isPrime(intValue) && !binaryList.get(i).contains("0")) {
                answer+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(110011,10);
    }

    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {			// n의 제곱근까지 나누기
            if (n % i == 0) return false;
        }
        return true;
    }
}
