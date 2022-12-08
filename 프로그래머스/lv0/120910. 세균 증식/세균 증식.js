function solution(n, t) {
    let result = n * Math.pow(2, t);
    return result;
}
/*
    접근법 :
    시간(t) - 처음 세균 수 2(n)
    1시간 후 = 2(n) * 2의1(t)승
    2시간 후 = 2(n) * 2의2(t)승 ...

    제곱을 구해주는 함수 Math.pow() 를 사용해 쉽게 접근
*/