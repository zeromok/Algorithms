function solution(a, b) {
  if (a === b) return a;

  let result = 0;

  if (a > b) {
    for (let i = 0; i <= a - b; i++) {
      result += b + i;
    }

    return result;
  } else if (a < b) {
    for (let i = 0; i <= b - a; i++) {
      result += a + i;
    }

    return result;
  }
}
/* 
    접근법 :
    1. a === b
    2. a > b
    3. a < b
    위 3 경우를 생각해 접근...

    a, ..., b 라면
    a + a+1 + a+2 + a+n, b
    즉, (b - a) = n : n번 만큼 반복해 더해준다...!


    다른 접근법 :
    조금 더 간결하게 바꿔보았다.
    function solution(a, b) {
        if(a === b) return a;
    
        let min = max = result = 0;
        
        if(a > b) {
            min = b; max = a;
        } else {
            min = a; max = b;
        }
        
        for(let i=min; i<=max; i++) {
            result += i
        }
        return result;
    }
*/