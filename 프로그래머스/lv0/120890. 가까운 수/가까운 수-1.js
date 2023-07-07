function solution(array, n) {
  return array.reduce((acc, curr) => {
    // acc: 누적값, curr: 현재값
    let currValue = Math.abs(curr - n); // 현재값과 n과의 차이
    let resultValue = Math.abs(acc - n); // 누적(초기)값과 n과의 차이

    // 만약 현재값과 n과의 거리가 더 가까우면 || 차이가 같고 (가까운수가 여러개고) && 현재값이 더 작으면
    if (currValue < resultValue || (currValue === resultValue && acc > curr))
      return curr; // 현재값을 반환

    return acc; // 누적값을 반환
  }, array[0]);
}
