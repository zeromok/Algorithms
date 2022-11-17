function solution(num_list) {
    var answer = [];
    for(let i=0; i<num_list.length; i++) {
        answer.unshift(num_list[i]);
    }
    // var answer = num_list.reverse();
    return answer;
}
/*
    풀이
    - 배열에 맨 앞에 요소를 추가해주는 unshift() 를 사용했다.
    - 추가하면서 num_list 의 처음요소가 마지막에 위치한다.

    다른 방법
    - reverse() 사용 하기
*/