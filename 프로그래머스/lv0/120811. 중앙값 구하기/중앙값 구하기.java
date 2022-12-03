import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(int)Math.floor(array.length/2)];
        return answer;
    }
}
/*
    접근법 :
    JS 와는 다르게 자바는 역시 타입 때문에 생각이 좀 길어진다.
    내장함수가 없으므로, Arrays 를 임포트해 .sort() 메소드 사용
    Math.floor() 를 이용해 중앙의 인덱스 찾아내기 double 타입으로 반환되므로, int로 형변환

    **주의 :
    Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로,
    객체를 생성하지 않고도 바로 사용할 수 있다.
    이러한 Math 클래스는 java.lang 패키지에 포함되어 제공
*/