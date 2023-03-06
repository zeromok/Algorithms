function solution(n) {
    if(n === 1) return 0; // 뒤늦게 추가...

    let count = 0;
    
    while (n !== 1) { // n이 1일때까지 무한반복
        if (n % 2 === 0) { // 짝수일때.
            n = n/2;
            count++;
        }else if (n % 2 === 1) { // 홀수일때.
            n = n * 3 + 1;
            count++;
        }
    }
    // 삼항연산자를 이용해 횟수가 500이상이면 -1 반환
    return count > 500 ? -1 : count;
}
/*
* 접근법 :
* 문제를 제대로 보지못해 푸나마나한 문제였던것 같다.
* 주어진수가 1일때, 0 이라는 조건을 보지못했다...
* 다음부터는 좀 더 제대로 보고 문제풀이에 들어가야겠다.
* */

/*
* Refactor
    function solution(n) {
        let count = 0;

        while (n !== 1 && count !== 500){
            n % 2 === 0 ? n = n/2 : n= (n * 3) + 1;
            count++
        }
        return num === 1 ? count : -1;
    }
*/