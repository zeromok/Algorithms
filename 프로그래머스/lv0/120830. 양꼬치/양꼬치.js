/*
    !생각해보니 내가 푼 풀이법보다 더 좋은 풀이 법이 있는것 같아 추가 하려고 한다.(자바에는 적용함)
    function solution(n, k) {
        let ans = (n * 12000) + (k *2000) - (parseInt(n/10) * 2000);
        return ans;
    }

    parseInt() : 양꼬치 10개에 음료 1개 서비스 이여서 몫이 떨어지게끔 함수를 적용하였다.
*/
function solution(n, k) {
    let totalN = n * 12000;
    let totalK = k * 2000;
    let total = totalN + totalK;
    
    if(n >= 10){
       return total -= (parseInt(n/10) * 2000);
    }
    
    return total;
}