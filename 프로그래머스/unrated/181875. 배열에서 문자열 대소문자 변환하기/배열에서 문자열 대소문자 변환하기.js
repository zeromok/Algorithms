function solution(strArr) {
    return strArr.map((item, idx) => {
        if(idx % 2 === 0) return item.toLowerCase();
        if(idx % 2 === 1) return item.toUpperCase();
    })
}