function solution(n) {
    let result = (n+'').split("");
    let ans = 0;
    for(let num of result) {
        ans += parseInt(num);
    }
    return ans;
}
/*
    접근법 :
    1. 매개변수에 들어온 숫자를 자리수 하나씩 배열에 넣어 해결해보자
    2. n 을 문자열로 만들어 주기 -> n + '' = String
    3. split() 함수를 사용해 배열 생성 후 result에 넣기 -> 매개변수로 들어갈 separator = "" : 단어별로 잘라 넣어준다.
    4. result 배열의 값들을 순회하며 -> for of
    5. count 변수로 만들어둔 ans 에 숫자로 변환시켜 넣기 -> parseInt()

    다른 접근 :
    1. toString() 을 사용해 문자열로 바꾸어주기
    2. Number 를 사용해 형변환

    function solution(n) {
        let result = n.toString().split("");
        let ans = 0;
        for(let num of result) {
            ans += Number(num);
        }
        return ans;
    }

    **주의 :
    parseInt() : 문자열로 된 숫자에서 숫자(정수)만 뽑아서 변환 -> 문자로 시작하는건 안됨
    Number() : 문자열 전체가 숫자일때 소수점까지 숫자타입으로 가져올 수 있다.
*/
