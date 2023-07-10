function solution(numbers) {
  return Array.from({ length: 10 }, (_, idx) => idx) // 길이 10, 인덱스 0~9까지의 배열 생성
    .filter((number) => !numbers.includes(number)) // 위 생성된 인덱스와 numbers 의 요소들 비교 후 0~9까지 없는 숫자만 필터링
    .reduce((acc, curr) => acc + curr); // 필터링된 요소들을 더함
}
