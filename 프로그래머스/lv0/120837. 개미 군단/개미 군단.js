function solution(hp) {
   if(5 > hp) {
    return Math.floor(hp/3) + hp%3;   
   }else if(3 > hp) {
       return hp;
   }else {
       let x = Math.floor(hp/5);
       let y = hp%5;
       return x + Math.floor(y/3) + y%3;
   }
    
}