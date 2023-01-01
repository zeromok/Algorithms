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
    1. 들어온 정수의 각 자릿수를 구한다.
    2. 각 자릿수를 더해 x에 나누어지면 true/false

    들어온 정수를 핸들링 하기 쉽게 문자열로 바꿔줌 -> String(x)
    각 자릿수를 원소로 갖는 배열로 만들기 -> split()
    각 원소를 순회하며 숫자로 바꾸고 더해주기 -> forEach()


    다른 접근법 :
    좀 더 간결하게 바꾸어 보았다.
    
    function solution(x) {
        let sun = 0;
        String(x).split("").forEach( (ele) => {
            sum += Number(ele);
        })
        return x%sum === 0;
    }

*/