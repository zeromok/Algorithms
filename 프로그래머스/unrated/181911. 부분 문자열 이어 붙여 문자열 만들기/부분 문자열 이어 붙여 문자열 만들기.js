function solution(my_strings, parts) {
    let result = '';
    my_strings.map((item, idx) => {
      result += item.substring(parts[idx][0], parts[idx][1] + 1);
   })
   return result;
}