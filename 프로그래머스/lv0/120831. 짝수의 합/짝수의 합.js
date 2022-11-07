function solution(n) {
    let sum = 0;
    
    /* for(let i=0; 0<=n; i++ ){
        if(n%2 == 0){
            sum += n;
        }
        n--;
    } */

    // 변수 i를 활용하는 쪽으로 수정
    for(let i=n; i>=0; i--){
        if(n%2 ==0){
            sum += n;
        }
        n--;
    }
    return sum;
    
}