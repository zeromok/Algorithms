function solution(array, n) {
  // array 의 요소 중 n 과 가까운 수
  let result = array[0];

  for (let i = 1; i < array.length; i++) {
    const temp = array[i];
    const currentDifference = Math.abs(n - temp);
    const resultDifference = Math.abs(n - result);

    if (
      currentDifference < resultDifference ||
      (currentDifference === resultDifference && temp < result)
    ) {
      result = temp;
    }
  }

  return result;

}