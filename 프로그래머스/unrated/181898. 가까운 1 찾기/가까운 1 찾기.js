function solution(arr, idx) {
    return arr.findIndex((ele, index) => ele === 1 && index >= idx);
}