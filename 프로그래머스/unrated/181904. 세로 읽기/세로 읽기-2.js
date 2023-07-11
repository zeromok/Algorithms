function solution(my_string, m, c) {
  return Array.from({ length: Math.ceil(my_string.length / m) }, (_, idx) => {
    return my_string.substring(idx * m, idx * m + m).charAt(c - 1);
  }).join("");
}
