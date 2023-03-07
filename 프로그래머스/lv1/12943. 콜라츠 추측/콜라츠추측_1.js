function solution(n) {

    for (let i = 0; i < 501; i++) {
        // 주어진 수가 1일 때, 0반환
        if (n === 1) return i;
        // i = 작업횟수 즉, 500일때 -1
        else if (i === 500) return -1;
        // 짝수일때
        else if (n % 2 === 0) n = n / 2;
        // 홀수일때
        else if (n % 2 === 1) n = n * 3 + 1;
    }
    return n;
}
/*
* 다른 접근법 :
* 최대 작업횟수만큼 범위내에서 반복
* 즉, n = 1일때 까지 반복후 반환된 i 는 === 작업횟수
* */