import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.List;

public class stick {

    public static void main(String[] args) throws Exception {
        int initStick = 64;
        List<Integer> sticks = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken()); // 목표 cm

        int count = 0;
        int cm = 0;

        sticks.add(initStick);

        while (initStick != 1) {
            if (initStick >= X) {
                sticks.add(initStick / 2);
            } else {
                sticks.add(initStick / 2);
                sticks.add(initStick / 2);
            }

            initStick = initStick / 2;
        }

        for (int i = 0; i < sticks.size(); i++) {
            int stick = sticks.get(i);
            if (sticks.get(i) > X) {
                continue;
            } else {
                if(cm + stick > X) {
                    continue;
                } else if(cm + stick < X) {
                    cm = cm + stick;
                    count+=1;
                } else {
                    count+=1;
                    break;
                };
            }
        }

        System.out.println(count);
    }
}
