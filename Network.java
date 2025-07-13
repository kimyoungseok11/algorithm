public class Network {
    public static int solution(int n, int[][] computer) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]) {
                answer += 1;
                dfs(i, visited, computer);
            }    
        }

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] computer = {{1,1,0},{1,1,0},{0,1,1}};

        solution(n, computer);
    }

    public static void dfs(int node, boolean[] visited, int[][] computer) {
        visited[node] = true;

        for (int i = 0; i < computer.length; i++) {
            if (!visited[node] && computer[node][i] == 0) {
                dfs(i, visited, computer);
            }
        }
    }
}