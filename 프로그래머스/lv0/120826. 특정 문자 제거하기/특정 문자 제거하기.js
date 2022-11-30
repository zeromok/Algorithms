function solution(my_string, letter) {
    let arr = my_string.split('');
    for(let i=0; i<arr.length; i++) {
        if(arr[i] === letter) {
            arr.splice(i, 1);
            i--;
        }
    }
    return arr.join('');
}

/*
    접근법 : 
    1. 매개변수로 들어온 문자열(my_string)을 배열로 변환 -> arr
    2. arr을 순회하며 인덱스값이 매개변수로 들어온 문자(letter) 와 일치하면 삭제 -> .splice();
    3. splice() 함수를 사용할 때 주의할 점 : 
        함수실행 즉시 요소가 삭제되고 배열의 길이가 변경되기 때문에 반복문 안에서 주의해서 사용하기 -> i--;
    4. 결과로 나온 최종 배열을 .join() 을 사용해 문자열로 변환 후 리턴


    다른 풀이 : 정규식 사용
    new RegExp() : 정규식안에 변수를 넣을 때 사용
                 : 아래에서는 /str/gi -> new RegExp(str, 'gi');
    g : 전역 탐색
    i : 대소문자 구분하지 않음

    function solution(my_string, letter) {
        let str = new RegExp(letter, 'gi');
        let result = my_string.replace(str, '');
        return result;
    }
    
*/