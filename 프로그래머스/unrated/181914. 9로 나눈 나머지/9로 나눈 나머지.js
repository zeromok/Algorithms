function solution(number) {
    return number.split("")
        .map(Number)
        .reduce((acc, curr) => acc + curr) % 9;
}