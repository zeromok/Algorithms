function solution(n) {

    let sqrt = Math.sqrt(n);
    let result = Math.pow( (sqrt + 1) , 2);

    if( !Number.isInteger(sqrt) ) {
        return -1;
    }

    return result;

}
/*
    접근법 :
        1. n의 제곱근
        2. n이 정수인지 소수점인지 판별
        3. 정수면 (제곱근 + 1) 제곱
        4. 소수점이면 -1

    .sqrt()                     : 루트를 씌워 제곱근을 구해준다.
    .pow(대상값, 몇번제곱할래?) : 제곱이 필요할 때 사용하는 함수
    Number.isInteger()          : 매개변수로 들어온 값이 정수이니?


    다른 접근법 :
        정수는 1로 나누면 항상 나머지가 0이 된다.

    function solution(n) {

        let sqrt = Math.sqrt(n);
        let result = Math.pow( (sqrt + 1) , 2);

        if( sqrt % 1 === 0 ) {
            return result;
        }

        return -1;

    }
*/