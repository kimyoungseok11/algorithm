public class Network {
    public static int solution(int n, int[][] computer) {
        int result = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < computer.length; i++) {
            if(!visited[i]) {
                result++;
                dfs(i, computer, visited);
            }
        }

        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] computer = {{1,1,0},{1,1,0},{0,1,1}};

        solution(n, computer);
    }

    public static void dfs(int node, int[][] computer, boolean[] visited) {
        visited[node] = true;

        for (int i = 0; i < computer.length; i++) {
            if (!visited[node] && computer[node][i] == 0) {
                dfs(node, computer, visited);
            }
        }
    }
}