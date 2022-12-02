function solution(s1, s2) {
    let result = s1.filter( (e) => { return s2.includes(e); });
    return result.length;
}
/*
    접근법 :
    1. s1의 요소와 s2의 요소를 비교해서 중복되는 요소의 길이를 구해보자
    2. filter() 안 콜백함수의 역할 -> s2의 요소와 비교해 중복되면 true 반환(요소 유지)
    3. includes() 를 사용해 s1의 요소가 s2에 들어있는지 검사 true/false 반환

    다른 풀이 :
    1. 위 코드보다는 번거롭지만 매개변수로 들어온 배열을 반복문으로 비교해 접근
    function solution(s1, s2) {
        let result = 0;
        for(let i=0; i<s1.length; i++) {
            for(let j=0; j<s2.length; j++) {
                if(s1[i] === s2[j]) {
                    result++;
                }
            }
        }
        return result;
    }
*/   