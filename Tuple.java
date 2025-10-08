import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tuple {
    public static int[] solution(String s) {
        Matcher m = Pattern.compile("\\{([^{}]+)\\}").matcher(s);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        while (m.find()) {
            String[] nums = m.group(1).split(",");
            List<Integer> temp = new ArrayList<>();

            for (String n : nums) temp.add(Integer.parseInt(n));
            list.add(temp);
        }

        list.sort(Comparator.comparingInt(List::size));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if(!answerList.contains(list.get(i).get(j))) {
                    answerList.add(list.get(i).get(j));
                }
            }
        }

        System.out.println(answerList);

        int[] arr = answerList.stream().mapToInt(Integer::intValue).toArray();

        return arr;
    }

    public static void main(String[] args) {
        solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
    }
}
