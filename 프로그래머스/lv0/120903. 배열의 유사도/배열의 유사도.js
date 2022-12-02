function solution(s1, s2) {
    let result = s1.filter( (e) => { return s2.includes(e); });
    return result.length;
}   