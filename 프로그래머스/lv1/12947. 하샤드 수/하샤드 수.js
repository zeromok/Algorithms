function solution(x) {
    // 들어온 정수의 자릿수를 구함
    // 각 자릿수를 더해 x에 나누어 0이면 true 아니면 false
    
    let str = String(x);
    let sum = 0
    let result = str.split("").forEach( (ele) => {
        sum += Number(ele);
    })
    return x%sum === 0;
    
}
/*
    접근법 :


    다른 접근법 :
    
*/