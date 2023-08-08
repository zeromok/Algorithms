function solution(s) {
    let temp = "";
    for (let i = 0; i < s.length; i++) {
        if (s.split(s[i]).length === 2) temp += s[i];
    }
    return temp.split("").sort().join("");
}