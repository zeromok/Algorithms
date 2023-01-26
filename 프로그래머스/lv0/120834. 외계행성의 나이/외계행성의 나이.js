function solution(age) {
    // 아스키코드 접근
    // 0~9 : 48~57  + 49 = a~z
    // a~z : 97~122

    // 결과값으로 반환될 문자열
    let result = "";

    // 들어온 숫자를 문자로 바꿔준다.
    let str = age.toString();

    // 문자 -> 아스키 코드
    // 아스키코드 + 49 -> 문자
    // 변수(result)에 더해준다.
    for (let i = 0; i < str.length; i++) {
        result += String.fromCodePoint(str.charCodeAt(i) + 49)
    }

    return result;

}
/*
    접근법 :
    문제를 보자마자 아스키코드로 접근하면 되겠구나 생각이 났다.

    String.fromCodePoint(a) : a를 문자로 바꿔준다.
    a.charCodeAt(i) : 문자 a의 i번째 문자를 아스코드로 변환

    1. 들어온 숫자 -> 문자열
    2. 문자열를 반복하며 각각의 문자 -> 아스키 코드
    3. 아스키코드에 49를 더하면 매핑이 되니깐 아스키코드 + 49 -> 문자


    다른 접근법:
    조금 하드코딩스럽긴 하지만...

    function solution(age) {
        
        const char = [ "a", 'b', "c", "d", "e", "f", "g", "h", "i", "j" ];

        let result = "";

        let str = age.toString();
        for(let i=0; i<str.length; i++) {
            result += char[str[i]];
        }

        return result;
    }
*/