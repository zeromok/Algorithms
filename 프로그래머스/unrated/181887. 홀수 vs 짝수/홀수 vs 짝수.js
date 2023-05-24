function solution(num_list) {
    const oddSum = num_list.filter((_, index) => index % 2 === 1).reduce((a, b) => a + b, 0);
  const evenSum = num_list.filter((_, index) => index % 2 === 0).reduce((a, b) => a + b, 0);
  
  return Math.max(oddSum, evenSum);
}