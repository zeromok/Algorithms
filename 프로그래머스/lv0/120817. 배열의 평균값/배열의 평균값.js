function solution(numbers) {
    return numbers.reduce( (a, b) => {
        return a + b / numbers.length;
    },0);
}