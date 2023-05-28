function solution(arr1, arr2) {
    if(arr1.length === arr2.length) {
        let arrSum1 = arr1.reduce((acc, curr) => acc + curr);
        let arrSum2 = arr2.reduce((acc, curr) => acc + curr);
        return arrSum1 > arrSum2 ? 1 : arrSum1 < arrSum2 ? -1 : 0;
    } else {
        return arr1.length > arr2.length ? 1 : -1;
    }
}