function solution(arr) {
    let idx = arr.indexOf(Math.min(...arr));
    arr.splice(idx, 1);
    return idx === 0 ? [-1] : arr;
}
