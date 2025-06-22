import java.util.*;

public class DFSBFS {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int n = 6; // 노드 수 (1~5번 노드)
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(2, 5);
        addEdge(3, 5);

        System.out.println("DFS:");
        dfs(1);
        
        System.out.println("\nBFS:");
        Arrays.fill(visited, false); // 방문 배열 초기화
        bfs(1);
    }

    static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // 무방향 그래프
    }

    // DFS - 재귀
    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // BFS - 큐 사용
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
