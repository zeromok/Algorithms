class Solution {
    public int solution(int n, int t) {
        return n * (int)Math.pow(2, t);
    }
}
/*
    접근법 :
    시간(t) - 처음 세균 수 2(n)
    1시간 후 = 2(n) * 2의1(t)승
    2시간 후 = 2(n) * 2의2(t)승 ...

    JAVA 에서는 Math.pow() 의 리턴, 매개변수타입 -> bouble타입 !
    나온 값을 현변환해줘서 반환한다.
*/