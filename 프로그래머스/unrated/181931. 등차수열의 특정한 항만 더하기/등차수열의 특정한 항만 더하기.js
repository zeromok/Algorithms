function solution(a, d, included) {
    let comm = [];
    let trueIdx = [];
    let result = 0;

    for (let i = 0; i < included.length; i++) {
        comm.push(a + (i * d));
        if (included[i]) trueIdx.push(i);
    }

    for (const element of trueIdx) {
        result += comm[element];
    }
    return result;
}