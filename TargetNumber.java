public class TargetNumber {
    static int answer = 0;
    public static int solution(int[] numbers, int target) {
        
        dfs(numbers,target,0,0);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;

        solution(numbers, target);
    }

    private static void dfs(int[] numbers, int target, int depth, int calc) {

        if (depth == numbers.length) {
            if (calc == target) {
                answer += 1;
            }
            return;
        } else {
            dfs(numbers, target, depth + 1, calc + numbers[depth]);
            dfs(numbers, target, depth + 1, calc - numbers[depth]);
        }

    }
}
