function solution(n) {
    let result = [];
    for(let i=0; i<=n; i++) {
        if(i%2 === 1) {
            result.push(i);
        }
    }
    return result;
}
/*
    접근법 :
    1. 0~n 개까지 순회 하면서 조건문을 달아 홀수만 배열에 저장
    2. 홀수만 들어갈 배열 선언
    3. n개까지 순회하는 for문 선언
    4. for문 안 홀수만 판별해내는 if문 선언후 통과되면 배열에 추가

    다른 풀이 :
    filter( (value) => { result value%2 === 1; } )
*/