function solution(arr) {
    return arr.every((row, i) => row.every((val, j) => val === arr[j][i])) ? 1 : 0;
}
/**
 * Array.prototype.every() : 배열 안의 모든 요소가 주어진 판별 함수를 통과하는지 테스트 합니다.
 * @return Boolean
* */