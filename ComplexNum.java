import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComplexNum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int count = 0;

        // X가 몇 번째 대각선에 속하는지 찾기
        while (count + line < X) {
            count += line;
            line++;
        }
        System.out.println(line + " " + count);
        int pos = X - count; // 해당 대각선에서의 위치 (1부터 시작)

        int numerator, denominator;
        if (line % 2 == 1) { // 홀수 대각선: 분자 감소, 분모 증가 (↗ 방향)
            numerator = line - pos + 1;
            denominator = pos;
        } else { // 짝수 대각선: 분자 증가, 분모 감소 (↙ 방향)
            numerator = pos;
            denominator = line - pos + 1;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
//1/1
//1/2
//2/1
//3/1
//2/2
//1/3
//1/4
//2/3
//3/2
//4/1
//5/1