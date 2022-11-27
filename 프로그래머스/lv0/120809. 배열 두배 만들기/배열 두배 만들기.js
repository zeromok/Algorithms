function solution(numbers) {
    newArr = [];
    for(let i=0; i<numbers.length; i++) {
        newArr.push(numbers[i] * 2)
    }
    return newArr;
}