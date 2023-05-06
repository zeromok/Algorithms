function solution(n) {
    let result = 0;
    for(let i = 1; i <= n; i++) {
        result += (n % 2 == 1) ? ((i % 2 == 1) ? i : 0) : ((i % 2 == 0) ? i * i : 0);
    }
    return result;
}