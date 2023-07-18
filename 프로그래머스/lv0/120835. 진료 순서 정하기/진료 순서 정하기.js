function solution(emergency) {
  return emergency.map(
    (num) => [...emergency].sort((a, b) => b - a).indexOf(num) + 1
  );
}
