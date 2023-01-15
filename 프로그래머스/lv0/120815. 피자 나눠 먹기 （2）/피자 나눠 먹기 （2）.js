function solution(n) {
    let piece = 6;
    let result = n * 6;
    // 최대 공약수
    while (piece !== 0) {
        let r = n % piece;
        n = piece;
        piece = r;
    }
    return (result / n) / 6;
}
/*
    접근법 :
    n(피자먹는 사람), piece(피자조각) 의 "최소공배수" 를 구해 6으로 나누어 반환

    두 수 a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수를 나눈 것과 같다.
        - a * b / a와 b의 최대공약수 = a와 b의 최소공배수

    최대 공약수(GCD), 최소공배수(LCM)를 이용하는 "유클리드 호제법"으로 접근
        - 최대 공약수
        1. 큰수%작은수 == 나머지
        2. 작은수%나머지 == 0
        3. 나머지가 0이되는 순간 작은수 = "최대공약수"

        - 최소 공배수
        1. 두 수의 곱 / 두 수의 최대공약수

    위 풀이에서는 큰수, 작은수를 정하지 않았지만 통과되었다..?


    다른 접근법 : 좀 더 Js스럽게 풀어 보자

    function solution(n) {
        let piece = 6;
        const gcd = (a, b) => a % b === 0 ? b : gcd(b, a % b);
        const lcm = (a, b) => a * b / gcd(a, b);
        return n/gcd(n, piece);
        // || return lcm(n, piece)/6;
    } 


*/