function solution(a, d, included) {
    return included.reduce((acc, curr, idx) => {
        if (curr)
            acc += a + (idx * d);
        return acc;
    }, 0)
}