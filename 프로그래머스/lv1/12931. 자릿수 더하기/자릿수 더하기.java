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
/*
    접근법 :
    들어온 자연수(n)를 String 으로 변환 -> Integer.toString(n);
    for문을 통해 각 자리 문자에 접근 해 int 로 바꾼후 누적 -> .charAt(i) - '0';


    다른 접근법 :
        (n + "")   : 빈 문자열을 더해 자연수 -> 문자열
    .toCharArray() : 문자열 -> 배열
    향상된 for문을 사용해 원소들을 뽑아 누적
    
    import java.util.*;
    public class Solution {
        public int solution(int n) {

            String result = n + "";
            char[] str = result.toCharArray();
            int sum = 0;

            for(char e : str) {
                sum += e - '0';
            }

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            return sum;
        }
    }
*/