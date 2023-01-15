function solution(n) {
    let piece = 6;
    let result = n*6;
    while(piece !== 0) {
        let r = n % piece;
        n = piece;
        piece = r;
    }
    return (result/n)/6;
}