function solution(n) {
    let result = (n+'').split("");
    let ans = 0;
    for(let num of result) {
        ans += parseInt(num);
    }
    return ans;
}