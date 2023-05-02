function solution(num_list) {
    let multiply = num_list.reduce((acc, curr) => acc * curr);
    let sumSquare = Math.pow(num_list.reduce((acc, curr) => acc + curr), 2)
    return multiply > sumSquare ? 0 : 1;
}