function solution(arr) {
    return arr.map((item) => {
        if(item >= 50 && item % 2 === 0) return item / 2;
        if(item < 50 && item % 2 === 1) return item * 2;
        return item;
    })
}