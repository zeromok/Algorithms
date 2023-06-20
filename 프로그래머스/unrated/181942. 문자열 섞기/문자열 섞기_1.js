function solution(str1, str2) {
    return [...str1].map((char, idx) => char + str2[idx]).join("");
}