import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
     
        String[] arr = my_string.split("");
        
        Collections.swap(Arrays.asList(arr), num1, num2);
    
        String result = "";
        for(String item : arr) {
            result += item;
        }
        
        return result;
    }
}
/*
    접근법 :
    1. 문자열 -> 배열 === .split();
    2. 위치 바꾸기 === Collections.swap();
    2-1. 배열 -> 리스트 === Arrays.asList();
    3. 문자열로 변환해 반환

    위 풀이에서 사용된 함수들에 대해 알아보자
    Collections.swap() : Collections 객체 안 static method swap()

    public static void swap(List<?> list, int i, int j)
    - list
        요소를 swap할 주체 (List 타입)
    - int i
        swap 할 요소의 인덱스
    - int j
        swap 할 다른 요소의 인덱스


    다른 접근법 :
    조금 더 쉽게 접근가능하다.

    class Solution {
        public String solution(String my_string, int num1, int num2) {
        
            char char1 = my_string.charAt(num1);
            char char2 = my_string.charAt(num2);
            
            char[] arr = my_string.toCharArray();
            
            arr[num1] = char2;
            arr[num2] = char1;
            
            return String.valueOf(arr);
            
        }
    }
*/  