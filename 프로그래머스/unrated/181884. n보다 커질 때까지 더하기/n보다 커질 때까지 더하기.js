function solution(numbers, n) {
    let temp = 0;
   for (let item of numbers) {
      temp += item;
      if (temp > n) return temp;
   }
}