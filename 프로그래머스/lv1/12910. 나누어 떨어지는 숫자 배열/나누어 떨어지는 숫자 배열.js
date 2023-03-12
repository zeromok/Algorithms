function solution(arr, divisor) {
    let result = [];
    arr.forEach((item) => {
        if (item % divisor === 0) result.push(item);
    });
    if (result.length === 0) result.push(-1);
    return result.sort( (a, b) => a - b);
}