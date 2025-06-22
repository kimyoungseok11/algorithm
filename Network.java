public class Network {
    public static int solution(int n, int[][] computer) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computer, visited);
                answer++;
            }
        }
        
        for (int i = 0; i < visited.length; i++) {
            System.out.println(visited[i]);
        }

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] computer = {{1,1,0},{1,1,0},{0,1,1}};

        solution(n, computer);
    }

    public static void dfs(int n, int[][] computer, boolean[] visited) {
        visited[n] = true;

        for (int i = 0; i < computer.length; i++) {
            if (computer[n][i] == 1 && !visited[i]) {
                dfs(i, computer, visited);
            }
        }
    }
}