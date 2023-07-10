function solution(numbers) {
  // 0~9 까지 모두 더한 수 - numbers 요소들의 모든 합 = 0~9 중 numbers 안에 없는 수들의 합
  return 45 - numbers.reduce((acc, curr) => acc + curr);
}
