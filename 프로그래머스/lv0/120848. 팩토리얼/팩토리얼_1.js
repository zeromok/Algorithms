function solution(n) {
    let result = 1; // 최대 팩토리얼

    for (let i = 1; i <= 10; i++) {
        result *= i; // 1 x 2 x 3 x ....
        if (result === n) return i;
        if (result > n) return i - 1;
    }

}