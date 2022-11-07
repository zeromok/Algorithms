// gcd : 최대공약수
function solution(denum1, num1, denum2, num2) {
    let ans = [];
    let num = denum1 * num2 + denum2 * num1;
    let den = num1 * num2;
    let gcd = (a, b) => {
        return (a % b === 0 ? b : gcd(b, a % b));
    }
    let y = gcd(num, den);
    ans[0] = num / y;
    ans[1] = den / y;
    return ans;
     
}