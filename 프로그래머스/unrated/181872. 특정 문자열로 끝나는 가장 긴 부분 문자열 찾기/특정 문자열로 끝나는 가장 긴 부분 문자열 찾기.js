function solution(myString, pat) {
  // myString 의 부분문자열중 pat 으로 끝나는 문자열 리턴
  return myString
    .split("")
    .map((_, idx) => myString.slice(0, idx + 1))
    .filter((item) => item.endsWith(pat))
    .reduce((acc, curr) => curr, "");
}
