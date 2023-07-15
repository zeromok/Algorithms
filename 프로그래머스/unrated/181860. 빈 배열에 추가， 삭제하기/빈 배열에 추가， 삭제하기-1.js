function solution(arr, flag) {
    return arr.reduce((acc, curr, idx) => {
        if (flag[idx]) {
            acc.push(...Array(curr * 2).fill(curr));
        } else {
            acc.splice(acc.length - curr);
        }
        return acc;
    }, []);
}
