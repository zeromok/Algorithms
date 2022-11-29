function solution(numbers) {
    let arr = numbers.sort( (a, b) => {return b-a;});
    let result = numbers[0] * numbers[1];
    return result;
}