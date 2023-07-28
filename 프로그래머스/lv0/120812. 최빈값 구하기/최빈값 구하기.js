function solution(array) {
    let map = new Map();
    for (let i = 0; i < array.length; i++) {
        if (map.has(array[i])) {
            map.set(array[i], map.get(array[i]) + 1);
        } else {
            map.set(array[i], 1);
        }
    }
    let count = 0;
    let num = 0;
    map.forEach((v, k) => {
        if (v > count) {
            count = v;
            num = k;
        } else if (v === count) {
            num = -1;
        }
    });
    return num;
}