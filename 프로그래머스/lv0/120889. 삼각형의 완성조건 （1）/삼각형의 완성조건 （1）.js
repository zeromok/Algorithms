function solution(sides) {
    newArr = sides.sort();
    return newArr[newArr.length - 1] >= newArr[0] + newArr[1] ? 2 : 1;
}
/*
    나의 풀이 :
    1. 들어온 배열을 .sort() 하면 끝 인덱스의 값은 가장 큰변이 된다.
    2. 가장 큰 변을 앞 2개의 인덱스 값 합에 비교 후 1 또는 2 반환 하도록 삼항연산자 비교
    3. 가장 큰 변 >= 나머지 변의 합 ? 2 : 1; -> 같을 경우 2(만들 수 없음) 반환
*/