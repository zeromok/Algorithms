function solution(my_string) {
    let result = my_string.split("").filter( (word) => {return !isNaN(word)});
    let sum = 0;
    for(let i=0; i< result.length; i++) {
        sum += parseInt(result[i]);
    }
    return sum;
}
// filter()
// 안 콜백 함수