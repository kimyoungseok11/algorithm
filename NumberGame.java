public class NumberGame {
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        int number = 0; // 처음 시작
        int numLen = 1; // 자릿수
        int order = 1; // 현재 차례

        while (answer.length() != t) {
            String binary = Integer.toString(number,n).toUpperCase();
            if(order == p) {
                answer += binary.charAt(numLen - 1);
                order += 1;
                p = p + m;
                System.out.println(p);
            } else {
                order += 1;
            }
            if(numLen == binary.length()) {
                number += 1;
                numLen = 1;
            } else {
                numLen += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p
        solution(16,16,2,2);
    }
}
