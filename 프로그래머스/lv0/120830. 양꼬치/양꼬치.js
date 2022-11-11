function solution(n, k) {
    let totalN = n * 12000;
    let totalK = k * 2000;
    let total = totalN + totalK;
    
    if(n >= 10){
       return total -= (parseInt(n/10) * 2000);
    }
    
    return total;
}