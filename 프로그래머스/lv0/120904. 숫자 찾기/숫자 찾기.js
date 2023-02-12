function solution(num, k) {
    // 정수num -> 문자열배열num
    // 문자열배열num 에서 k와 같은 정수를 찾아 반환
    
    let str = num.toString().split("");
    
    let search = str.indexOf("" + k);
    
    if(search === -1) return -1;
    
    return search + 1;
} // end