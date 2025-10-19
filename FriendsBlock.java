public class FriendsBlock {
    static boolean[][] marked;

    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] grid = new char[m][n];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                grid[i][j] = board[i].charAt(j);
            }
        }
        
        while (true) {
            boolean[][] sameChar = new boolean[m][n];
            int count = 0;

            for (int i = 0; i < grid.length - 1; i++) {
                for (int j = 0; j < grid[i].length - 1; j++) {
                    char letter = grid[i][j];
                    if (letter == ' ') {
                        continue;
                    } else {
                        if (letter == grid[i + 1][j] && letter == grid[i][j + 1] && letter == grid[i + 1][j + 1]) {
                            sameChar[i][j] = true;
                            sameChar[i+1][j] = true;
                            sameChar[i][j+1] = true;
                            sameChar[i+1][j+1] = true;
                        }
                    }
                }
            }

            for (int i = 0; i < sameChar.length; i++) {
                for (int j = 0; j < sameChar[i].length; j++) {
                    if (sameChar[i][j]) {
                        count += 1;
                    }
                }
            }
            
            answer += count;
            if (count == 0) {
                break;
            }

            for (int col = 0; col < n; col++) {
                int write = m - 1;                 // 아래에서 채워 넣을 위치
                for (int row = m - 1; row >= 0; row--) {
                    if (!sameChar[row][col]) {       // 지울 칸이 아니면 아래로 내림
                        grid[write--][col] = grid[row][col];
                    }
                }
                // 위쪽 나머지는 빈칸으로
                while (write >= 0) {
                    grid[write--][col] = ' ';        // 0(널문자)로 빈칸 표시
                }
            }

            count = 0;
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
