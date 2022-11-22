function solution(num_list) {
    let newArr = [];
    let num1 = 0;
    let num2 = 0;
    num_list.forEach( (num) => {
        if(num%2 == 0) {
            num1 += 1;
        }else{
        num2 += 1;
        }
    });
    newArr.push(num1);
    newArr.push(num2);
    return newArr;
}
/*
    다른 풀이
    : filter() 를 이용하는 방법

    function solution(num_list) {
        let newArr = num_list.filter( (num) => {
            return num%2 === 0
        }).length;
        return [newArr, num_list.length - newArr]
    }
*/