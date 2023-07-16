function solution(arr) {
    let idx = arr.indexOf(Math.min(...arr));
    if (idx === 0) return [-1];
    arr.splice(idx, 1);
    return arr;
}