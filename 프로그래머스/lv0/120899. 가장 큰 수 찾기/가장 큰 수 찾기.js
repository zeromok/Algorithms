function solution(array) {
    let result = []
    let copy = [...array].sort( (a, b) => {return a-b;});
    result.push(copy[copy.length - 1]);
    result.push(array.indexOf(copy[copy.length - 1]));
    return result;
}
/*
    접근법 :
    들어온 배열 중 가장 큰 수와 인덱스를 요소로가지는 배열이 필요하다.

    가장 큰 수 :
        result[0]          -> 매개변수로 들어온 배열을 정렬 후 마지막 요소
    가장 큰 수의 인덱스 :
        result[1] -> 매개변수로 들어온 배열에서 indexOf(가장 큰 수) 사용

    result :
        결과값을 넣을 변수
    copy :
        매개변수로 들어온 배열을 깊은복사 -> copy 가 변해도 원래 배열은 상관 없다.
    copy[copy.length - 1] :
        마지막 요소 가져오기 즉, 요소 중 가장 큰 수
    array.indexOf(copy[copy.length - 1]) :
        가장 큰 수를 이용해 원래 배열에서의 인덱스 가져오기

    
    다른 접근법 :

    1. 배열의 깊은복사, 마지막 인덱스를 가져오는 방법을 다르게 해보았다.

    function solution(array) {
        let copy = array.slice().sort( (a, b) => { return a-b; });
        let result  = [];
        result.push(copy.slice(-1)[0]);
        result.push(array.indexOf(copy.slice(-1)[0]));
        return result;
    }

    2. 스프레드연산자를 사용하면 배열이나 문자열과 같이 반복 가능한 문자를 0개 이상의 인수 (함수로 호출할 경우)로 확장가능
    
    function solution(array) {
        let result = [Math.max(...array), array.indexOf(...array);
        return result;
    }
*/