function solution(str1, str2) {
    let result = "";
    for (let i = 1; i <= str1.length; i++) {
        result += str1.substring(i - 1, i) + str2.substring(i - 1, i);
    }
    return result;
}