import java.util.LinkedList;
import java.util.Queue;

public class PastRoot {
    static int[][] maze = {
        {1, 0, 1, 1, 1, 1},
        {1, 0, 1, 0, 1, 0},
        {1, 0, 1, 0, 1, 1},
        {1, 1, 1, 0, 1, 1},
        {0, 0, 0, 0, 1, 1}
    };
    static int n = maze.length;
    static int m = maze[0].length;
    static int[][] dist = new int[n][m]; // 최단거리 저장

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        bfs(0, 0);

        System.out.println("최단 거리: " + dist[n - 1][m - 1]); // 도착점 거리 출력
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        dist[x][y] = 1;

        while(!queue.isEmpty()) {
            int[] node = queue.poll();
            int cx = node[0];
            int cy = node[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(maze[nx][ny] == 0 || dist[nx][ny] != 0) continue;

                dist[nx][ny] = dist[cx][cy] + 1;
                queue.offer(new int[] {nx,ny});
            }
        }
    }
}
