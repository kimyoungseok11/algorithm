import java.util.Arrays;

public class BigNumber {
    private static int solution(String nmk, String numbers) {
        int result = 0;

        int[] sNmk = Arrays.stream(nmk.split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();
        int[] sNumbers = Arrays.stream(numbers.split(" "))
                             .mapToInt(Integer::parseInt)
                             .distinct()                 // 중복 제거
                             .sorted()                  // 오름차순 정렬
                             .toArray();                // int[]로 변환

        Arrays.sort(sNumbers);

        for(int i = 1; i <= sNmk[1]; i++) {
            if(i % (sNmk[2] + 1) == 0) {
                result += sNumbers[sNumbers.length-2];
            } else {
                result += sNumbers[sNumbers.length-1];
            }
        }

        System.out.println(result);
        
        return result;
    }
    public static void main(String[] args) {
        String nmk = "5 8 3";
        String numbers = "2 4 5 4 6";

        solution(nmk, numbers);
    }
}
