function solution(my_string, s, e) {
     let params = my_string
    .substring(s, e + 1)
    .split("")
    .reverse();

  let strArr = my_string.split("");

  strArr.splice(s, e - s + 1, ...params);

  return strArr.join("");
}