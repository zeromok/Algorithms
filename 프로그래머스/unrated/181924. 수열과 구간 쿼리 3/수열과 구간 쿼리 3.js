function solution(arr, queries) {
    queries.forEach((querie, idx) => {
        let temp = arr[querie[0]];
        arr[querie[0]] = arr[querie[1]];
        arr[querie[1]] = temp;
    });
    return arr;
}