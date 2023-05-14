function solution(a, b) {
    return (a * b) % 2 == 1 ? a * a + b * b :
           (a % 2 == 1 || b % 2 == 1) ? 2 * (a + b) :
           (a * b) % 2 == 0 ? Math.abs(a - b) :
           0;
}