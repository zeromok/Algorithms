function solution(start, end) {
    let temp = [];
   for (let i = start; i >= 0; i--) {
       temp.push(i);
      if (i === end) break;
   }
   return temp;
}