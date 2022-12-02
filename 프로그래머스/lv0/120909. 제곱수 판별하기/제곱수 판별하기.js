function solution(n) {
    let result = Math.sqrt(n);
    if(Number.isInteger(result)) {
        return 1;
    }
    return 2;
}
/*
    접근법 :
    1. n에 루트를 붙여 정수가 나오면 1, 아니면 2 를 반환해야 한다. -> 제곱수 구하기
    2. Math 객체의 sqrt()함수는 값을 넘겨주면 루트값을 반환해준다.
    3. 그 반환값이 정수면 1, 아니면 2를 반환해주면 해결
    4. 조건문 안에 정수인지 판별하는 식을 넣어준다. -> Number.inInteger() : 너 정수니?

    다른 풀이 :
    1. 정수인지 판별하는 식이 하나 더 있다.
        if( 값%1 === 0 )
    2. 정수를 1로 나누면 0이 나오니깐 위 식 처럼 써도 잘 해결되었다.
*/