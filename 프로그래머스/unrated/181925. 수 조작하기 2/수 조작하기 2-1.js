function solution(numLog) {
    return numLog.reduce((acc, curr, idx) => {
        const diff = curr - numLog[idx - 1];
        return acc + (diff === 1 ? "w" : diff === 10 ? "d" : diff === -1 ? "s" : diff === -10 ? "a" : "");
    }, "");
}