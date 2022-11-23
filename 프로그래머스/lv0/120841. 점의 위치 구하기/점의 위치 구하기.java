class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int result = 0;

        if(x > 0 && y > 0) {
            result = 1;
        }else if(x < 0 && y > 0) {
            result = 2;
        }else if(x < 0 && y < 0) {
            result = 3;
        }else if(x > 0 && y < 0) {
            result = 4;
        }
        return result;
    }
}
/*
    자바스크립트와 어떠한 점이 다른가? -> return의 쓰임

    JAVA의 return : 그 즉시, 해당 "메소드"를 중지하고, void인경우 중지, 반환타입이 있는 메소드라면? 반드시 반환타입을 리턴해줘야 한다.
                  : 위 자바코드가 JS코드와 다른 이유는 "모든상황을 커버할수 있게" 만들어 줬기 때문이다. (마지막에 꼭 else로 끝내기) -> 조금은 불편한 코드

    JS의 return : 그 즉시, 함수 실행을 중지하고, (값을 제공한 경우)주어진 값을 함수 호출 지점으로 반환

    =========
    다른 풀이 -> 삼항연산자 사용
    =========
    int x = dot[0];
    int y = dot[1];

    if(x>0){
        return y>0 ? 1 : 4;
    }
    return y>0 ? 2 : 3;
*/