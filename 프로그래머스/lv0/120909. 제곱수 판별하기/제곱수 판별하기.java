import java.lang.Math;
class Solution {
    public int solution(int n) {
        double result = Math.sqrt(n);
        if(result%1 == 0) {
            return 1;
        }
        return 2;
    }
}
/*
    접근법 :
    1. js 처럼 접근하려 했으나 타입 문제로 조금 생각이 필요했다.
    2. sqrt() 메소드로 실행한 값이 정수일수도 실수일수도 있으니 둘다 들어갈 수 있는 double 타입을 선언해 변수에 넣었다.
    3. 조건식에 정수 판별식을 넣어 비교했다. -> 실수면 0이 나오지 않는다.

    다른 풀이 :
    1. if 안 조건식을 아래의 식으로 대체 가능
    if(result == (int)result)
*/