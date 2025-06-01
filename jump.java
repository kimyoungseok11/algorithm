import java.util.*;

public class jump {
    public static int solution(int n) {
        int ans = 0;
        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n -= 1;
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(5000));
    }
}

