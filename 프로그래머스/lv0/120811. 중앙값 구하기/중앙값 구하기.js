function solution(array) {
    let result = array.sort( (a, b) => {return a-b;});
    let answer = array[Math.floor(array.length/2)]
    return answer;
}
/*
    접근법 :
    sort() 를 활용해 오름차순 정렬 시키고, 중앙에 있는 인덱스 값을 뽑아 반환해주면 되지 않을까?
    매개변수의 오름차순 정렬 -> result
    중앙에 있는 인덱스 값 구하기 -> answer

    **주의 :
    매개변수로 들어온 배열은 홀수 라서 중앙에 있는 인덱스를 뽑아올 때,
    Math.floor() 함수를 이용해 Ex) 3.5 -> 3 정수로 잘라줘야 한다.
*/