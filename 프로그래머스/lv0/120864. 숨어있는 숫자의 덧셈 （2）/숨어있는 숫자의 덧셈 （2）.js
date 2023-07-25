function solution(my_string) {
   let sum = 0;
    let currNum = 0;

    for (let i = 0; i < my_string.length; i++) {
        const char = my_string[i];

        if (char >= "0" && char <= "9") {
            currNum = currNum * 10 + parseInt(char);
        } else {
            sum += currNum;
            currNum = 0;
        }
    }
    sum += currNum;
    return sum;
}