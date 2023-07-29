function solution(my_string, indices) {
    let arr = my_string.split("");
    indices.forEach((num) => {
        delete arr[num];
    });
    return arr.join("");
}