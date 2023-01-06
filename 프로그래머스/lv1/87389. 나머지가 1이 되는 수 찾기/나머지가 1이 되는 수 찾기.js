function solution(n) {
    // n%x === 1
    // 가장 작은 x를 구해야한다.
    for(let i=n; i>=0; i--){
        if(n%(i-n) === 1) {
            return (n-i);
        }
    }
}