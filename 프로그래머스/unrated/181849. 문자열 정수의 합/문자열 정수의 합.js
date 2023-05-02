function solution(num_str) {
    let arr = num_str.split("");
    return arr.map(item => Number.parseInt(item)).reduce((acc, curr) => acc + curr);
}