function solution(my_string) {
    let str = 'aeiou';
    let result = my_string.split("");
    let answer = result.filter( (data) => {
        return !str.includes(data);
    });
    return answer.join('');       
}
/*
    접근법 :
    매개변수로 들어온 문자열에서 알파벳 모음을 제거해보자
    1. my_string 을 배열로 만들어 준다.
    2. 배열에서 모음 제거는 어떻게? -> 특정문자 제거 후 새로운 배열 반환 -> .filter() 를 이용
    3. 특정문자 제거는 어떻게? -> .filter() 안 콜백 함수로 -> .includes() 사용
    4. .includes() -> 문자열이 특정 문자[열]을 포함하는지 판별,  배열이 특정 요소를 포함하고 있는지 판별
    5. str = '모음';을 만들어 비교해보자
    6. str.includes(문자열 요소) -> 있으면 true, 없으면 false
    7. filter( (data) => {return !str.includes(data)}); -> 일치하지 않는 요소를 뽑아내야하니깐 ! 사용
    8. 마지막의 결과값을 .join() 으로 문자열로 만들어 반환

    다른풀이 :
    매개변수로 들어온 문자열에서 문자제거 -> 즉, 문자열 치환!
    replace() 를 사용한 풀이

    function solution(my_string) {
        return my_string.replace(/['a','e','i','o','u']/g,'')
    }
*/