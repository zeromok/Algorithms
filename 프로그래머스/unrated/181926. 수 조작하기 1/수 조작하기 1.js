function solution(n, control) {
    control.split("").map( (item) => {
      if (item === 'w') n++;
      if (item === 's') n--;
      if (item === 'd') n = n + 10;
      if (item === 'a') n = n - 10;
   })
   return n;
}