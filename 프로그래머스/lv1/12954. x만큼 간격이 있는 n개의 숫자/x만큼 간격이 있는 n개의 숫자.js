function solution(x, n) {
    let result = [];
    for(let i=0; i<n; i++) {
        result[i] = x + (i * x)
    }
    return result;
}
/*
    접근법 :
    위 내가 작성한 코드는 JS 와는 맞는것 같지는 않지만..
    명령형이 아닌 선언형으로 풀고 싶었다...

    1. 빈 배열을 선언후
    2. for문을 사용해
        0 = x
        1 = x + x
        2 = x + x + x
        ... 순차적으로 배열에 들어가게끔 만들어 줬다.

    의문점 :
    맨 처음 무지성으로 아래의 코드를 작성하고 왜 안되지 라는 생각을 했다 반성하자.

    function solution(x, n) {
        let result = [];
        for(let i=x; 0<=n; i+=x) {
            result.push(i);
        }
        return result;
    }


    다른 접근법 :
    명령형으로 접근해보자
    
    Array([value1, value2, value3, ...]) : 새로운 Array 객체를 만들어주는 생성자
                                         : 매개변수가 정수하나인경우 length 가 된다.
    fill(value[, start[, end]]) : 배열의 시작 인덱스부터 끝 인덱스의 이전까지 정적인 값(매개변수) 하나로 채움
    map( (value[, index[, array]]) -> {}) : 콜백함수의 리턴값이 true인 값들을 모아 새로운 배열 반환

    function solution(x, n) {
        return Array(n).fill(x).map( (value, index) => {
            (index + 1) * value
        });
    }
    
*/