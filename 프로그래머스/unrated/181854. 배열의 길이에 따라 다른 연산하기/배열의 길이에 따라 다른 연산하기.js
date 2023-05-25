function solution(arr, n) {
  return arr.map((num, idx) => (idx % 2 === arr.length % 2) ? num : num + n);

}