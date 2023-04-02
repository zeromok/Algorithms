function factorial (item) {
    if (item <= 1) return 1;
    return item * factorial(item - 1);
}
// 제한사항 0 < n <= 3,628,800
// 결과는 무조건 10 이하의 정수
function solution(n) {
    let result = 0

    for(let i = 1 ; i <= 10; i++) {
        if(n >= factorial(i)) {
            result = i;
        } else {
            return result;
        }
    }
    return result;
}