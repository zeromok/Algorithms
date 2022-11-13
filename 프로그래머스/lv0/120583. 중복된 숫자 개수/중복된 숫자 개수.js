function solution(array, n) {
    newArr = [];
    array.forEach((e) => {
        if(e == n){
            newArr.push(n);
        }
    });
    return newArr.length;
}