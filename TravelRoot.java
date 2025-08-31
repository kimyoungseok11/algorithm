import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelRoot {
    static boolean[] visited;
    static List<String> answer = new ArrayList<>();

    public static String[] solution(String[][] tickets) {
        // 1️⃣ 티켓을 도착지 기준 알파벳 순으로 정렬
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));

        for (int i = 0; i < tickets.length; i++) {
            System.out.println(tickets[i][0] + " " + tickets[i][1]);
        }

        visited = new boolean[tickets.length];
        List<String> path = new ArrayList<>();
        path.add(tickets[0][0]); // 시작점

        dfs(tickets[0][0], tickets, path, 0);
        return answer.toArray(new String[0]);
    }

    static boolean dfs(String current, String[][] tickets, List<String> path, int usedCount) {
        if (usedCount == tickets.length) {
            // 모든 티켓 사용 → 정답 확정
            answer = new ArrayList<>(path);
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                path.add(tickets[i][1]);

                if (dfs(tickets[i][1], tickets, path, usedCount + 1)) return true;

                // 백트래킹
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[][] tickets = {
            {"ICN", "SFO"},
            {"ICN", "ATL"},
            {"SFO", "ATL"},
            {"ATL", "ICN"},
            {"ATL", "SFO"}
        };

        solution(tickets);
        //System.out.println(Arrays.toString(result));
    }
}