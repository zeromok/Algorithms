function solution(names) {
    return names.filter((item, idx) => (idx + 5) % 5 === 0);
}