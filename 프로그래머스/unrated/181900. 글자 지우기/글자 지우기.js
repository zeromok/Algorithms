function solution(my_string, indices) {
    let my_stringArr = my_string.split("");
    indices.forEach((num) => {
        delete my_stringArr[num];
    });
    return my_stringArr.join("");
}
