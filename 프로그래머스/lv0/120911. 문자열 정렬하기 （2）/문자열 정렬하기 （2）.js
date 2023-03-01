function solution(my_string) {
    
    let result = my_string
        .toLowerCase() // 문자열 -> 소문자
        .split("") // 문자열 -> 배열
        .sort() // 배열 안 요소 정렬
        .join(""); // 배열 -> 문자열
    
    return result;
}