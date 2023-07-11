function solution(my_string, m, c) {
    let result = "";
    for (let i = 0; i < my_string.length; i++) {
        if (i * m + m <= my_string.length) 
            result += my_string.substring(i * m, i * m + m).charAt(c - 1);
           
    }
    return result;
}