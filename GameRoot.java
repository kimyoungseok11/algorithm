import java.util.LinkedList;
import java.util.Queue;

public class GameRoot {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dist = new int[n][m];
        bfs(0, 0, dist, maps, n, m);

        int answer = dist[n-1][m-1] != 0 ? dist[n-1][m-1]:-1;

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] maps = {
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,0,0},
            {0,0,0,0,1}
        };
        solution(maps);
    }

    public static void bfs(int x, int y, int[][] dist, int[][] maps, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        dist[x][y] = 1;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int nx = node[0];
            int ny = node[1];

            for (int i = 0; i < 4; i++) {
                int cx = nx + dx[i];
                int cy = ny + dy[i];

                if (cx < 0 || cx >= n || cy < 0 || cy >= m) {
                    continue;
                }

                if (dist[cx][cy] != 0 || maps[cx][cy] == 0) {
                    continue;
                }

                dist[cx][cy] = dist[nx][ny] + 1;
                queue.offer(new int[]{cx,cy});
            }
        }
    }
}
