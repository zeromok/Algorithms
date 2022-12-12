function solution(n, numlist) {
    let result = numlist.filter( (element) => { return element%n === 0 });
    return result;
}
/*
    접근법 :
    .filter() : 콜백 함수를 통과해 true인 요소만 모아 새로운 배열 반환

    element(요소)%n === 0 즉, n으로 나누었을 때, 0인 요소 = n 의 배수이다.
*/