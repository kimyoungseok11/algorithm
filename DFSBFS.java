import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFSBFS {
    static List<List<Integer>> graph = new ArrayList<>();
    static List<Boolean> visited = new ArrayList<>();

    public static void main(String[] args) {
        int n = 6; // 0번 노드부터 5번 노드까지 총 6개 (1~5번 노드 사용)

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            visited.add(false);
        }

        // 간선 추가
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(2, 5);
        addEdge(3, 5);

        System.out.println("DFS:");
        dfs(1);
    }

    static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void dfs(int node) {
        visited.set(node, true);

        System.out.print(node + " ");
        for (int next : graph.get(node)) {
            System.out.println(graph.get(node));
            if (!visited.get(next)) {
                dfs(next);
            }
        }
    }

}
