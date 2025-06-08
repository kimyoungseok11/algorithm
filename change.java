public class change {
    private static int solution(int money) {
        int n = 0;
        int[] coins = {500,100,50,10};
        for(int i = 0; i < coins.length; i++) {
            n += money / coins[i];

            money = money%coins[i];
        }
        
        return n;
    }
    public static void main(String[] args) {
        int money = 1260;
        System.out.println(solution(money));
    }
}
