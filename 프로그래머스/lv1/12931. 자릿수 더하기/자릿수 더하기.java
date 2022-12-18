import java.util.*;

public class Solution {
    public int solution(int n) {
        String result = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<result.length(); i++) {
            sum += result.charAt(i) - '0';
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return sum;
    }
}