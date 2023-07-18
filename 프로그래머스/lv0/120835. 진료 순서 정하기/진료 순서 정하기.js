function solution(emergency) {
    return emergency.map((num, idx, arr) => {
    let sorted = [...emergency].sort((a, b) => b - a);
    return sorted.indexOf(num) + 1;
  });
}