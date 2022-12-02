class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        int result = 0;
        for(int i=0; i<arr.length; i++) {
           arr[i] = str.charAt(i) - '0';
            result += arr[i];
        }
        return result;
    }
}
/*
    접근법 :
    1. 들어온 매개변수 n 을 String 타입으로 형변환 -> String str = Integer.toString(n);
    2. n의 숫자들을 넣어줄 int배열 생성 -> int[] arr = new int[str.length()];
    3. String 타입인 n을 순회하며 단어 하나, 하나 만들어둔 배열에 넣어준다.
        - charAt() 를 통해 String -> char 변환
        - int 타입인 arr 배열에 넣기 위해 - '0' 을 해주어(Ascii Code 이용) char -> int 변환 
    4. count 변수(result)를 만들어 arr의 인덱스값 누적합 반환
*/