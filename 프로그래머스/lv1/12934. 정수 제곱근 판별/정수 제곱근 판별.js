function solution(n) {

    let sqrt = Math.sqrt(n);
    let result = Math.pow( (sqrt + 1) , 2);

    if( !Number.isInteger(sqrt) ) {
        return -1;
    }

    return result;
    
}