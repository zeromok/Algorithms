/*
    너무 자바에 익숙해져 있는것 같다. 사용가능한 함수가 많은데...
    함수를 적용시켜 다른 풀이 방법을 찾아보았다.

    방법 1. forEach() 사용 - 배열의 각 원소들을 순회하며 함수 실행
    function solution(array, height) {
        let total = 0;
        let ans = array.forEach( (e) => {
            if(e > height){
                total++;
            }
        })

        return total;
    }

    방법 2. filter() 사용 - 지정된 함수의 결과를 true로 만드는 원소들로만 구성된 새로운 배열 반환
    function solution(array, height) {
        let ans = array.filter( (e) => {
            return e > height
        }).length;

        return = ans;
    }
*/
function solution(array, height) {
    let answer = 0;
    for(let i=0; i<array.length; i++){
        if(array[i] > height){
            answer += 1;
        }
    }
    return answer;
}