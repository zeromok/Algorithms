function solution(my_string) {
    let result = [];
    my_string.split("").map((item, idx) => {
        result.push(my_string.slice(-idx));
    })
    return result.sort();
}