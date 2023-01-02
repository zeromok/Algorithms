function solution(n) {
    const result = String(n).split("").map( (a) => {
        return Number(a)
    }).sort( (a,b) => {
        return b-a
    }).join("");
    return Number(result);
}
/*
    접근법 :
    1. 정수로 들어온 매개변수를 문자열로 변환 -> String()
    2. 각각의 문자를 배열의 원소로 만들기 -> split("")
    3. 문자열 원소들을 정수로 변환 -> map()
    4. 정수로 변환된 원소들을 내림차순 정렬 -> sort()
    5. 정수로 이루어진 배열을 하나의 문자열로 만들기 -> join("")
    6. 문자열인 정수를 정수로 반환 -> Number()


    다른 접근법 :
    처음에 접근한 작성법에서 조금 간결하게 줄여보았다.

    function solution(n) {
        return Number(String(n).split("").sort().reverse().join(""));       
    }
*/