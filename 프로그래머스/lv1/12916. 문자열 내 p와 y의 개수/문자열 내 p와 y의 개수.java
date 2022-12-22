class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        String upper = s.toUpperCase();
        
        for(int i=0; i<upper.length(); i++) {
            if(upper.charAt(i) == 'P') {
                p++;
            }else if(upper.charAt(i) == 'Y') {
                y++;
            }
        }
        
        return p == y;
        
    }
}
/*
    접근법 :
        - 문자열을 모두 대문자 or 소문자로 바꿔서 접근
        - 찾은 문자의 개수를 받은 변수 선언
        - for문을 사용해 charAt()으로 문자를 찾아 변수++;
        - 두 문자의 개수가 담겨있는 변수들 비교 후 반환


    다른 접근법 :
        - 자바에서의 문자열 메소드를 활용해보자!
        - 문자열 치환 함수( .replace() )를 이용해 찾는 문자를 치환 후 길이를 비교했다.

    class Solution {
        boolean solution(String s) {

        int p = s.toUpperCase().replace("P", "").length;
        int y = s.toUpperCase().replace("Y", "").length;

        return p == y;

        }
    }
*/