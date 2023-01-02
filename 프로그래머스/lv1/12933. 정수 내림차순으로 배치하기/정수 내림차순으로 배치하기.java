
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String result = "";
        for(int i=0; i<arr.length; i++) {
            result += arr[i];
        }
        
        return Long.parseLong(result);
    }
}
/*
    접근법 :
    1. 매개변수 n을 문자열로 변환 -> String.valueOf()
    2. 변환된 문자열을 문자 하나하나 배열로 만들기 -> .split("")
    3. 배열의 원소들을 내림차순 정렬 -> Arrays.sort(arr, Collections.reverseOrder());
    4. 배열을 순회하며 빈 문자열에 넣어준다.
    5. 완성된 문자열을 long 타입으로 변환해 반환

    
    다른 접근법 :
    import java.util.*
    class Solution {
        public long solution(long n) {

            String[] str = String.valueOf(n).split("");
            Arrays.sort(str);

            StringBuilder sb = new StringBuilder();
            for(String result : str) {
                sb.append(result);
            }

            return Long.parseLong(sb.reverse().toString());
        }
    }
*/