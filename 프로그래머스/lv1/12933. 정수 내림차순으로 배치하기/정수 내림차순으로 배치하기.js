function solution(n) {
    const result = String(n).split("").map( (a) => {
        return Number(a)
    }).sort( (a,b) => {
        return b-a
    }).join("");
    return Number(result);
}