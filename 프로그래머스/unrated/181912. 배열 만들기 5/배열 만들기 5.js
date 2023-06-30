function solution(intStrs, k, s, l) {
    let result = [];
    for (let str of intStrs) {
        if (k < Number(str.substring(s, s + l))) result.push(Number(str.substring(s, s + l)))
    }
    return result;
}