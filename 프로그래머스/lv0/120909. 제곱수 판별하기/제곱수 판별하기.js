function solution(n) {
    let result = Math.sqrt(n);
    if(Number.isInteger(result)) {
        return 1;
    }
    return 2;
}