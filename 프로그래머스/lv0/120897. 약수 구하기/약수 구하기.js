function solution(n) {
    let result = [];
    for(let i=1; i<=n; i++) {
        if(n%i === 0) {
            result.push(i);
        }
    }
    return result.sort( (a, b) => {return a-b});
}
/*
    접근법 :
    : n의 약수를 구한다. -> for문의 조건식을 통해 약수를 구한다.
    : 배열에 담는다. -> if문을 이용해 약수일 때 배열에 넣어줌
    : 오름차순으로 반환 한다. -> sort();를 이용해 오름차순 반환


    다른 접근법 :
    1. 주어진 수의 절반을 대상으로 확인
        약수는 본인을 제외하고 n/2 보다 클 수 없기 때문에... -> 성능이 좋아진다.

    function solution(n){
        let result = [];
        for(let i=1; i<=n/2; i++) {
            if(n%i === 0) {
                result.push(i);
            }
        }
        return [...result, n];
    }
*/