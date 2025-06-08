public class LRUD {
    private static String solution(int n, String[] moves) {
        String result = "";
        int row = 1;
        int column = 1;

        for (int i = 0; i < moves.length; i++) {
            if(moves[i].equals("L")) {
                if(column - 1 > 0) {
                    column -= 1;
                }
            } else if(moves[i].equals("R")) {
                if(column + 1 <= n) {
                    column += 1;
                }
            } else if(moves[i].equals("U")) {
                if(row - 1 > 0) {
                    row += 1;
                }
            } else if(moves[i].equals("D")) {
                if(row + 1 <= n) {
                    row += 1;
                }
            }
        }

        result = row + " " + column;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String[] moves = {"R","R","R","U","D","D"};
        solution(5, moves);
    }
}
