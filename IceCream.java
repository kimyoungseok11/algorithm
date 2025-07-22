public class IceCream {

    static int n = 4;
    static int m = 5;
    static int[][] iceCase = {{0,0,1,1,0},{0,0,0,1,1},{1,1,1,1,1},{0,0,0,0,0}};
    static boolean[][] visited = new boolean[n][m];

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < iceCase.length; i++) {
            for (int j = 0; j < iceCase[i].length; j++) {
                if(dfs(i, j)) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    public static boolean dfs(int x, int y) {
        if(x < 0 || x >=n || y < 0 || y>= m) return false;
        
        if(!visited[x][y] && iceCase[x][y] == 0) {
            visited[x][y] = true;
            dfs(x, y-1);
            dfs(x, y+1);
            dfs(x-1, y);
            dfs(x+1, y);

            return true;
        }
        

        return false;
    }
}
