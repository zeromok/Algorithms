function solution(my_string, n) {
    let answer = [];
    for(let i=0; i<my_string.length; i++){
        answer.push(my_string[i]);
        for(let j=1; j<n; j++) {
            answer.push(my_string[i]);
        }
    }
    return answer.join('');
}
/*
    나의 풀이법 :
    1. my_string(문자열)의 각 문자를 n번 반복한 문자열을 반환해줘야한다.
    2. 빈 배열을 만든다
        -> 문자열을 순회하며 각 문자를 n번 반복해 넣는다
        -> 배열을 문자열로 반환
*/