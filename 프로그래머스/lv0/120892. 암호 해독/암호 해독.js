function solution(cipher, code) {
    let result = '';
    let ans = cipher.split('')
    for(let i=code-1; i<ans.length; i+=code) {
        result += ans[i];
    }
    return result;
}