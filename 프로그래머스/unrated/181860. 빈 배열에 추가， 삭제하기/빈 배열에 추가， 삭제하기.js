function solution(arr, flag) {
    let result = [];
    for (let idx in arr) {
        if (flag[idx]) {
            Array.from({ length: arr[idx] * 2 }, () => result.push(arr[idx]));
        } else {
            result = result.slice(0, result.length - arr[idx]);
        }
    }
    return result;
}