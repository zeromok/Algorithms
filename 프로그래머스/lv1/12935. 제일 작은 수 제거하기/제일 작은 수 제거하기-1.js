function solution(arr) {
    let min = Math.min(...arr);
    return arr.filter((num) => num !== min);
}
