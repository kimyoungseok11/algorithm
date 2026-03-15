import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class goodArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int needCnt = 0;
        List<Integer> cntArr = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            arr.add(number);
        }

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);

            for (int j = 0; j < 5; j++) {
                if(!arr.contains(num + j)){
                    needCnt += 1;
                };
            }
            cntArr.add(needCnt);
            needCnt = 0;
        }

        System.out.println(Collections.min(cntArr));
    }
}
