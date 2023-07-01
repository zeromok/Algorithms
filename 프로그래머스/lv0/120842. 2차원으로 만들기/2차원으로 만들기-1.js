function solution(num_list, n) {
  return Array(num_list.length / n)
    .fill()
    .map((_, idx) => num_list.slice(idx * n, idx * n + n));
}
