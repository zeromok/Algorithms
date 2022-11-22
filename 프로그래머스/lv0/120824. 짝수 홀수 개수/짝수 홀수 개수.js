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