import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[sides.length - 1] >= sides[0] + sides[1] ? 2 : 1;
    }
}
/*
    나의 풀이 :
    1. 들어온 배열을 .sort() 하면 끝 인덱스의 값은 가장 큰변이 된다.
    2. 가장 큰 변을 앞 2개의 인덱스 값 합에 비교 후 1 또는 2 반환 하도록 삼항연산자 비교
    3. 가장 큰 변 >= 나머지 변의 합 ? 2 : 1; -> 같을 경우 2(만들 수 없음) 반환
    4. 자바에서는 Arrays 클래스의 .sort()메소드를 활용해 JS와 비슷하게 접근
*/