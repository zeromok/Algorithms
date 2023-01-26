function solution(age) {
    // 아스키코드 접근
    // 0~9 : 48~57  + 49
    // a~z : 97~122
    
    let result = "";
    
    let str = age.toString();
    
    for(let i=0; i<str.length; i++) {
        result += String.fromCodePoint(str.charCodeAt(i) + 49)
    }
    
    return result;
    
}