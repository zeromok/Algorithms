function solution(numbers) {
    let arr = numbers.sort( (a, b) => {return b-a;});
    let result = numbers[0] * numbers[1];
    return result;
}
/*
    접근법 : 
    1. 매개변수로 들어온 배열의 원소의 곱 중 최대값 = 정렬 후 1,2번 째 원소
    2. arr = 매개변수로 들어온 배열의 내림차순
    3. 즉, arr의 0, 1번째 인덱스가 최대값 = 두 값을 곱하면 최대곱
*/
