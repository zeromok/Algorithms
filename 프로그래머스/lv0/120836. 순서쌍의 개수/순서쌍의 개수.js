function solution(n) {
    let arr = [];
    for(let i=1; i<=n; i++) {
        if(n%i === 0) {
            arr.push(i);
        }
    }
    return arr.length;
}
/*
    접근법 :
    1. 순서쌍 = 약수들의 곱 = 약수의 개수
    2. 1~n 개 까지 반복하며 나머지가 0 인 숫자(약수)들을 모아 배열에 넣자
    3. 약수들이 모인 배열의 길이를 반환하면 정답

    다른 풀이 :
    1. 배열에 넣지 않고 count변수(result)를 선언해 해결할 수도 있다.
        function solution(n) {
            let result = 0;
            for(let i=1; i<=n; i++) {
                if(n%i === 0) {
                    result++;
                }
            }
            return result;
        }
*/