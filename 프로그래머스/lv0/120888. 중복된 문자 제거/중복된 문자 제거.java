class Solution {
    public String solution(String str) {
        
        String result = ""; // 반환될 문자열

        char[] ch = str.toCharArray(); // 문자열 -> 문자타입의 배열
        for (char value : ch) {

            // 문자타입의 배열에서 요소를 꺼내 문자열에 있는지 확인
            if(result.contains(String.valueOf(value))) continue;

            result += value; // 없으면 문자열에 집어넣음
        }
        return result;
    }
}