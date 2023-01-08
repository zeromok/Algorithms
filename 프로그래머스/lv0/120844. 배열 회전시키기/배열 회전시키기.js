function solution(numbers, direction) {
    // direction 의 첫번째 문자를 구함
    // 'r'일 때 = 배열의 마지막요소가 첫번째 요소에 위치
    // 'l'일 때 = 배열의 첫번째요소가 마지막 요소에 위치
    
    if(direction.charAt(0) === 'r') {
        // 배열의 마지막 요소를 빼내 배열의 첫번째 인덱스로
        let last = numbers.pop();
        numbers.unshift(last);

        return numbers;
        
    }else if(direction.charAt(0) === 'l') {
        // 배열의 첫번째 요소를 빼내 배열의 맨 끝으로
        let shift = numbers.shift();
        numbers.push(shift);

        return numbers;

    }else{
        return numbers;
    }
}
/*
    접근법 :
    처음에 destructuring(구조분해할당) 으로 접근했으나, 아닌것 같아 배열의 함수를 이용하는 쪽으로 접근

    사용한 배열의 함수들
    pop()       : 배열의 마지막 요소를 제거, 제거된 요소 반환
    push()      : 배열의 마지막에 요소 추가, 추가된 배열 반환
    shift()     : 배열의 첫번째 요소를 제거, 제거된 요소 반환
    nushift()   : 배열의 처음에 요소 추가, 추가된 배열 반환

    위 사용한 함수들은 모두 원본 배열을 수정하는 함수들이므로, 주의**


    다른 접근법 :
    조금 더 간략하게? 줄여보았다.
    
    function solution(numbers, direction) {
    if(direction === 'right') {

        numbers.unshift(numbers.pop())

    } else {

        numbers.push(numbers.shift())

    }
    return numbers
}
*/