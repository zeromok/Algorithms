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