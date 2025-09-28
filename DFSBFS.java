import java.util.LinkedList;
import java.util.Queue;

public class DFSBFS {

    static boolean[] visited = new boolean[9];
    static int[][] graph = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};

    public static void main(String[] args) {
        dfs(1);

        visited = new boolean[9];
        System.out.println();
        bfs(1);

        visited = new boolean[9];
    }

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int next : graph[node]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}