function solution(money) {
    let arr = [];
    
    let result = Math.floor(money / 5500);
    let change = money%5500;
    
    arr.push(result);
    arr.push(change);
    
    return arr;
}