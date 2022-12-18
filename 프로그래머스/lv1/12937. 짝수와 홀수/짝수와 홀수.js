function solution(num) {
   if(num%2 === 0) {
       return "Even";
   }else if(num%2 === 1 || num%2 === -1) {
       return "Odd";
   }else {
       return num;
   }
}
/*
    접근법 :
    정수 num을 자연수로 생각해 접근했다가 조금 곤란했다...오류가 왜..?

    정수 : -정수, 0, +정수
    자연수 : +자연수

    num : int범위의 정수 즉, (-128 <= n <= +127)
    num%2 === 0 : 짝수 판별
    num%2 === 1 || num%2 === -1 : 홀수 판별
        ** 음의 정수를 2로 나누면 -1이 나오는 수 가 홀수이다. 

    
    다른 접근법 :
    삼항 연산자를 이용해 접근해 보았다.

    function solution(num) {
        let result = (num % 2 === 0) ? "Even" : "Odd";
        return result;
    }
*/