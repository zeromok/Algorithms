function solution(before, after) {
    // 들어온 매개변수들을 정렬시켜 비교
    let beforeStr = before.split("").sort().join("");
    let afterStr = after.split("").sort().join("");
    return beforeStr === afterStr ? 1 : 0;
}