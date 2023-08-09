function solution(s) {
    const sArr = s.split("");
    let result = "";
    for (let item of sArr) {
        if (sArr.indexOf(item) === sArr.lastIndexOf(item)) result = item;
    }
    return result;
}
