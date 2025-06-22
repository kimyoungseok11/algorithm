public class IceCream {

    static int n = 4;
    static int m = 5;
    static int[][] ice = {{0,0,1,1,0},{0,0,0,1,1},{1,1,1,1,1},{0,0,0,0,0}};
    static boolean[][] visited = new boolean[n][m];

    static int solution(int n, int m,int[][] ice) {
        int result = 0;

        for (int i = 0; i < ice.length; i++) {
            for (int j = 0; j < ice[i].length; j++) {
                if(ice[i][j] == 0 && !visited[i][j]) {
                    dfs(i, j);
                    result += 1;
                }
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        
        solution(n, m, ice);
    }

    public static void dfs(int x, int y) {

        if (x < 0 || x >= n || y < 0 || y >= m) return;

        if (visited[x][y] || ice[x][y] == 1) return;
        
        visited[x][y] = true;

        dfs(x, y-1);
        dfs(x, y+1);
        dfs(x-1, y);
        dfs(x+1, y);
    }
}
