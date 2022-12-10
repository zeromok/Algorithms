function solution(arr) {
    let sum = 0;
    for(let i=0; i<arr.length; i++) {
        sum += arr[i];
    }
    return sum/arr.length;
}
/*
    접근법 :
    평균을 구하는 쉬운 문제
    배열안 요소들을 더해 배열의 길이만큼 나누어 주면 된다.
    ( for문 사용 )

    다른 접근법 :
    JS의 내장 함수를 사용해 보자 -> .reduce();

    arr.reduce( (accumulator, currentValue, currentIndex) => {return ... } [ , InitialValue ] )
    arr                  : reduce()를 호출한 배열
    accumulator(누산기)  : 콜백함수의 반환값을 누적[ , InitialValue(가 제공되면) 의 값과 같다. ]
    currentValue         : 처리할 현재 요소
    currentIndex         : 현재 요소의 인덱스 초기값 1 [ , InitialValue가 있으면 0 ] 

    function soltion(arr) {
        let result = arr.reduce( (acc, cur) => { return acc + cur; }, 0 );
        return result / arr.length;
    }
*/