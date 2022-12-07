function solution(my_string) {
    let result = my_string.replaceAll(/[^0-9]/g, "").split("").map(Number).sort();
    return result;
}