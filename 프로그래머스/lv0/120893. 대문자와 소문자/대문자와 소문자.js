function solution(my_string) {
    let answer = '';
    for(let i=0; i<my_string.length; i++) {
        if(my_string[i] === my_string[i].toUpperCase()) {
            answer += my_string[i].toLowerCase();
        }else{
            answer += my_string[i].toUpperCase();
        }
    }
    return answer;
}
/*
    접근법 :
    들어온 문자열을 대문자는 소문자로, 소문자는 대문자로 바꿔야 한다.
    빈 문자열을 만들어 놓고 들어온 문자열을 순회하면 대,소문자로 바꾸어 넣는 방법을 해보자
    answer -> 대,소문자가 바뀐 문자가 들어갈 변수
    for문을 실행해 조건문으로 대소문자인지 판별후, 그에 맞게 넣어준다.

    다른 접근법 :
    
    1. 들어온 문자열을 문자 하나,하나 배열로 만들어 result에 담아줌
       result 기준으로 순회하며 풀어나가는 방법
    function solution(my_string) {
        let result = my_string.split('');
        for(let i=0; i<result.length; i++) {
            if(result[i] === result[i].toUpperCase()) {
                result[i] = result[i].toLowerCase();
            }else{
                result[i] = result[i].toUpperCase();
            }
        }
        return result.join('');
    }

    2. 유니코드를 이용한 방법
       'A' ~ = 65 ~, 'a' ~ = 97 ~
       즉, 97보다 작으면 대문자
    function solution(my_string) {
        let result = my_string.split('');
        for(let i=0; i<result.length; i++) {
            if(result[i].charCodeAt() < 97) {
                result[i] = result[i].toLowerCase();
            }else{
                result[i] = result[i].toUpperCase();
            }
        }
        return result.join('');
    }


*/
