function solution(my_string) {
    let result = my_string.split("").filter( (word) => {return !isNaN(word)});
    let sum = 0;
    for(let i=0; i< result.length; i++) {
        sum += parseInt(result[i]);
    }
    return sum;
}
/*
    접근법 :
    isNaN() : 어떤 값이 NaN(Not a Number)인지 판별 Number가 아니면 ture / Number이면 false

    다른 접근법 :
    Number() : 1. Number('10') = 10
               2. !Number('10') = false
               3. !!Number('10') = true
*/