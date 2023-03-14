function solution(arr, divisor) {
    let result = [];

    // 순회하며 조건이 참이면 배열에 넣음
    arr.forEach((item) => {
        if (item % divisor === 0) result.push(item);
    });

    // 배열에 아무요소도 없으면 -1 넣음
    if (result.length === 0) result.push(-1);

    // 정렬해서 반환
    return result.sort( (a, b) => a - b);
}