import java.util.*;
import java.util.regex.Pattern;

public class News {
    public static int solution(String str1, String str2) {
        List<String> str1Arr = new ArrayList<>();
        List<String> str2Arr = new ArrayList<>();
        
        // 문자열 전처리 (2글자씩 쪼개기, 영문자만 유효)
        for (int i = 0; i < str1.length() - 1; i++) {
            String unit = str1.substring(i, i + 2).toUpperCase();
            if (Pattern.matches("^[A-Z]{2}$", unit)) {
                str1Arr.add(unit);
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String unit = str2.substring(i, i + 2).toUpperCase();
            if (Pattern.matches("^[A-Z]{2}$", unit)) {
                str2Arr.add(unit);
            }
        }
        List<String> copyB = new ArrayList<>(str2Arr);
        int common = 0;
        for (String string : str1Arr) {
            if(copyB.contains(string)) {
                common += 1;
                copyB.remove(string);
            }
        }
        int all = str1Arr.size()+str2Arr.size()-common;
        double jacard = (all == 0) ? 1 : (double) common / all;
        if (jacard == 0.0) {
            jacard = 1;
        }

        int answer = (int) (jacard * 65536);

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("aa1+aa2", "AAAA12");
    }
}
