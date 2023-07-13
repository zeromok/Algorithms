function solution(myString, pat) {
  // myString 의 부분문자열중 pat 으로 끝나는 가장 긴 문자열 리턴
  let temp = [];
  for (let i = 0; i < myString.length; i++) {
    let subStr = myString.slice(0, i + 1);
    if (subStr.endsWith(pat)) temp.push(subStr);
  }
  return temp.pop();
}
