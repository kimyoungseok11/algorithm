public class capet {
    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total; height++) {
            int width = total / height;
            System.out.println(total + " " + height);
            if (total % height != 0) continue;  // 나눠떨어지지 않으면 패스
            if (width < height) continue;       // 가로 ≥ 세로 조건

            int innerWidth = width - 2;
            int innerHeight = height - 2;
            if (innerWidth * innerHeight == yellow) {
                return new int[]{width, height};
            }
        }

        return null; // 문제 조건 상 이 경우는 없음
    }
    public static void main(String[] args) {
        System.out.println(solution(10,2));
    }
}
