function solution(a, b) {
    if(a === b) return a;
    
    if((a - b) > 0) {
        result = 0;
        for(let i=0; i<=(a-b); i++) {
            result += b + i;
        }
        return result;
    }else if((a - b) < 0) {
        result1 = 0;
        for(let i=0; i<=(b-a); i++) {
            result1 += a + i
        }
        return result1;
    }
   
}