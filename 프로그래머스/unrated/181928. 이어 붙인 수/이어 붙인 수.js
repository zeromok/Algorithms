function solution(num_list) {
    const [oddNumbers, evenNumbers] = num_list.reduce(([odd, even], num) => num % 2 ? [odd.concat(num), even] : [odd, even.concat(num)], [[], []]);
  return parseInt(oddNumbers.join("")) + parseInt(evenNumbers.join(""));
}