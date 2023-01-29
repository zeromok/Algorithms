function solution(order) {
    
    let result = 0;
    
    [...order.toString()].forEach( item => { if( Number(item)%3 === 0 && Number(item)>=3 ) result++ } )
    
    return result;

}
/*
    접근법 :
    1. 369게임의 박수 횟수를 반환시켜야 한다.
    2. 즉, 3의 배수 를 리턴
    function solution(order) {

        let result = 0; -> 반환될 박수 횟수
        
        숫자(order) -> 문자(str) -> 배열(arr)
        [...order.toString()]

        배열을 순회하며 3,6,9 나오면 result++;
        .forEach( item => {
            if(3보다크고, 나머지 0일 때) result++;
        })
        
        return result;
    }


    다른 접근법 :

    function solution(order) {
        
        const result = [...order+''].filter(a => ['3','6','9'].includes(a)).length;

        return result;
    }

    [...order(123) + ''] = order이 숫자면, ['1', '2', '3'] 요렇게 만들어진다.

    =======================================
    arr.includes(valueToFind[, fromIndex])
    =======================================
        배열이 특정요소를 포함하고 있는지?
        return : boolean

        - valueToFind
            탐색할 요소.> 참고: 문자나 문자열을 비교할 때, includes()는 대소문자를 구분합니다.
        - fromIndex
            검색을 시작할 위치, 음수는 끝부터

    ==========================================================
    arr.filter(callback(element[, index[, array]])[, thisArg])
    ==========================================================
        주어진 함수의 테스트를 통과하는 모든 요소를 모아 새로운 배열로 반환 (원본배열 변화 x)
        return : 테스트를 통과한 요소로 이루어진 새로운 배열. 어떤 요소도 테스트를 통과하지 못했으면 빈 배열

        - callback
            각 요소를 시험할 함수. true를 반환하면 요소를 유지하고, false를 반환하면 버립니다.
        - element
            처리할 현재 요소.
        - index
            처리할 현재 요소의 인덱스.
        - array
            filter를 호출한 배열.
        - thisArg
            callback을 실행할 때 this로 사용하는 값.

*/