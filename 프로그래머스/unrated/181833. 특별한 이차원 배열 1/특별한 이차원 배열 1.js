function solution(n) {
    let result = Array.from(Array(n), () => new Array(n));
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (i === j) {
                result[i][j] = 1;
                continue;
            }
            result[i][j] = 0;
        }
    }
    return result;
}