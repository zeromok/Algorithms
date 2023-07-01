function solution(num_list, n) {
  return Array.from({ length: n }, (_, idx) => {
    num_list.slice(idx * n, idx * n + n);
  });
}
