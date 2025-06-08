import java.util.ArrayList;
import java.util.Arrays;

public class CardGame {
    private static int solution(String nm, int[][] cards) {
        int result = 0;
        ArrayList<Integer> minNumbers = new ArrayList<>();
        
        for(int i = 0; i < cards.length; i++) {
            minNumbers.add(Arrays.stream(cards[i]).min().getAsInt());
        }

        result = minNumbers.get(minNumbers.size()-1);
        System.out.println(result);
        return result; 
    }
    public static void main(String[] args) {
        String nm = "3 3";
        int[][] cards =  {{7,3,1,8},{3,3,3,4}};
        solution(nm, cards);
    }
}
