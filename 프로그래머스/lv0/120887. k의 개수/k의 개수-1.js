function solution(i, j, k) {
  return Array.from({ length: j - i + 1 }, (value, idx) => i + idx)
    .map(String)
    .flatMap((str) => str.split(""))
    .filter((char) => char === String(k)).length;
}
