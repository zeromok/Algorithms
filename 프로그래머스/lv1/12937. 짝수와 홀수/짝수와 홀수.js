function solution(num) {
   if(num%2 === 0) {
       return "Even";
   }else if(num%2 === 1 || num%2 === -1) {
       return "Odd";
   }else {
       return num;
   }
}