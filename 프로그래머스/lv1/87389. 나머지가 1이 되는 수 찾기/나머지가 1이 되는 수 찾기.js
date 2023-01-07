function solution(n) {
    // n%x === 1
    // 가장 작은 x를 구해야한다.
    for(let i=n; i>=0; i--){
        if(n%(i-n) === 1) {
            return (n-i);
        }
    }
}
/*
    접근법 :
    n%0, 1, 2, 3, ... 나누는 값을 작은 수 부터 올라가며 대입해주면서
    === 1일 때 바로 리턴이 되게끔 만들어 주었다.

    
    다른 접근법 :
    functrion solution(n) {

        for(int i=1; i<n; i++) {
            if(n%i === 1) { return i; }
        }
        
    }
*/                