function solution(n) {
    let sum = 0;
    
    for(let i=0; 0<=n; i++ ){
        if(n%2 == 0){
            sum += n;
        }
        n--;
    }
    return sum;
    
}