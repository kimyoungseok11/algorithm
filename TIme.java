public class TIme {
    private static int solution(int n) {
        int result = 0;

        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 59; j++) {
                for(int z = 0; z <= 59; z++) {
                    String tString = String.format("%02d", i) + String.format("%02d", j) + String.format("%02d", z);
                    if(tString.contains("3")) {
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        solution(5);
    }
}
