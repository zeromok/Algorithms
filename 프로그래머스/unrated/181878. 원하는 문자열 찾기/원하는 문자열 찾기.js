function solution(myString, pat) {
    let str = myString.toUpperCase();
    let strPat = pat.toUpperCase();
    return str.includes(strPat) ? 1 : 0;
}