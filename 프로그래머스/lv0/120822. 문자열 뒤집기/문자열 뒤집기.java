class Solution {
    public String solution(String my_string) {
        char[] newArr = my_string.toCharArray();
        char[] result = new char[newArr.length];
        for(int i=0; i<newArr.length; i++) {
            result[newArr.length -1 -i] = newArr[i];
        }
        String ans = new String(result);
        return ans;
    }
}
/*
    내가 푼 풀이법
    : String 문자열을 char배열로 변환 후 그 배열을 역순으로 새로운 배열에 저장해 반환하는 방법

    다른 풀이법
    : reverse() 메소드를 제공하는 StringBuilder/StringBuffer 클래스를 이용하는 방법
    ============
    StringBuffer
    ============
    : String 클래스의 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수는 없습니다.
    : 하지만 StringBuffer 클래스의 인스턴스는 그 값을 변경할 수도 있고, 추가할 수도 있습니다.

    class Solution {
        public String solution(String my_string) {
            
            StringBuffer sb = new StringBuffer(my_string);
            String reverseSb = sb.reverse().toString();
            
            return reverseSb;
        }
    }
*/