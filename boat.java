import java.util.*;

public class boat {
    public static int solution(int[] people, int limit){
        int ans = 0;
        Arrays.sort(people);

        // 배열을 ArrayList<Integer>로 변환
        List<Integer> list = new ArrayList<>();
        for (int person : people) {
            list.add(person);
        }

        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            int sum = list.get(left) + list.get(right);
            if(sum <= limit) {
                ans += 1;
                left++;
                right--;
            } else {
                ans += 1;
                right--;
            }
        }

        System.out.println(ans);

        return ans;
    }

    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }
}
