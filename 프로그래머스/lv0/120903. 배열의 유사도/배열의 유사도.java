class Solution {
    public int solution(String[] s1, String[] s2) {
        int result = 0;
        for(int i=0; i<s1.length; i++) {
            for(int j=0; j<s2.length; j++) {
                if( s1[i].equals(s2[j]) ) {
                    result++;
                }
            }
        }
        return result;
    }
}
/*
    접근법 :
    매개변수로 들어온 배열들을 반복문으로 접근해 해결해보았다.
    
    **주의 :
    처음에 if 문 안에 조건을 .equals 가 아닌 == 으로했는데 오류가났다.
    String 타입의 값을 비교하다보니 정확히 캐치를 못한 것 같다.

    == : 객체의 주소값 비교 -> 참조 타입 변수들 간의 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용
    .equals() : 데이터값 비교 -> 참초 타입에서 더 정확
    
*/