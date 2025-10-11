public class FriendsBlock {
    static boolean[][] marked;

    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        boolean[][] marked;
        for (int i = 0; i < board.length; i++) map[i] = board[i].toCharArray();

        while (true) {
            marked = new boolean[m][n];
            int count = 0;

            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];
                    if (c == ' ') continue;
                    
                    if (map[i + 1][j] == c && map[i][j + 1] == c && map[i + 1][j + 1] == c) {
                        marked[i][j] = true;
                        marked[i+1][j] = true;
                        marked[i][j+1] = true;
                        marked[i+1][j+1] = true;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (marked[i][j]) count+=1;
                }
            }

            if(count == 0) break;
            answer += count;

            for (int col = 0; col < n; col++) {
                int write = m - 1;                 // 아래에서 채워 넣을 위치
                for (int row = m - 1; row >= 0; row--) {
                    if (!marked[row][col]) {       // 지울 칸이 아니면 아래로 내림
                        map[write][col] = map[row][col];
                        write = write - 1;
                    }
                }
                // 위쪽 나머지는 빈칸으로
                while (write >= 0) {
                    map[write][col] = ' ';        // 0(널문자)로 빈칸 표시
                    write = write - 1;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] board = {
            "TTTANT", 
            "RRFACC", 
            "RRRFCC", 
            "TRRRAA", 
            "TTMMMF", 
            "TMMTTJ"
        };
        solution(6, 6, board);
    }
}
