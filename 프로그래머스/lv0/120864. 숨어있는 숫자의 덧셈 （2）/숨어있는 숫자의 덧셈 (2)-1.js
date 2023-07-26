function solution(my_string) {
    let sum = 0;
    let currentNumber = 0;

    for (let i = 0; i < my_string.length; i++) {
        const char = my_string[i];

        if (char >= "0" && char <= "9") {
            currentNumber = currentNumber * 10 + parseInt(char);
        } else {
            sum += currentNumber;
            currentNumber = 0;
        }
    }

    sum += currentNumber;
    return sum;
}
