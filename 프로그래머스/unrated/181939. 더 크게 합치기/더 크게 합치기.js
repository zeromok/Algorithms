function solution(a, b) {
    return (a + '').concat(b) > (b + '').concat(a) ? (Number)((a + '').concat(b)) : (Number)((b + '').concat(a));
}