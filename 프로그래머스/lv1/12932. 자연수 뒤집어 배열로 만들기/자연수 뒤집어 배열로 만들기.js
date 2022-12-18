function solution(n) {
    let result = (n + "").split('');
    return result.map(Number).reverse();
}