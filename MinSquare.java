public class MinSquare {
    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        int[][] sizes = {
            {60, 50},
            {30, 70},
            {60, 30},
            {80, 40}
        };

        solution(sizes);  // 출력: 4000
    }
}
