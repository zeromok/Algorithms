class Solution {
    public boolean solution(int x) {
        String str = "" + x;
        int sum = 0;
        String[] arr = str.split("");
        for(int i=0;i<arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return x%sum == 0;
    }
}
/*
    접근법 :
    JS 와 비슷한 방법으로 접근했다.
    타입과 형변환 주의하기 !

    다른 접근법 :
    자바에서 정수 -> 문자열 변환하는 방법
        1. String.valueOf()
        2. Integer.toString()
        3. String.format("정규식", 정수)
        4. 빈 문자열을 앞에 더해주면 변환 "" + 정수
    
*/