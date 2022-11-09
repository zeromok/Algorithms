/*
    reduce() 사용법
    arr.reduce( (누적값, 현재값, 인덱스, 요소) => {return 결과;}, 초기값 )
    누적값 = 초기값 + 현재값 -> 다음 연산에서 누적값이 초기값으로 이동
    덧셈, 평균구하기에 이용할 수 있다.
*/
function solution(numbers) {
    return numbers.reduce( (a, b) => {
        return a + b / numbers.length;
    },0);
}

// 다른 풀이 방법 - for문 이용
/*
    function solution(numbers) {
        let total = 0;
        for(let i=0; i<numbers.length; i++){
            return total += numbers[i];
        }
        return total / numbers.length;
    }
*/