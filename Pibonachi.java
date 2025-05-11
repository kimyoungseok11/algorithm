import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int f0 = 0;
        int f1 = 1;

        for (int i = 2; i <= n; i++ ) {
            answer = f0 + f1;
            f0 = f1;
            f1 = answer;
        }

        return answer;
    }
}

// The main method must be in a class named "Main".
class Pibonachi {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        System.out.println(s.solution(5));
        
    }
}