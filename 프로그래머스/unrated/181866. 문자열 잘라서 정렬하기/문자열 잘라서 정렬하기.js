function solution(myString) {
    return myString.split("x")
        .filter(item => item !== "")
        .sort((a, b) => {
            return a < b ? -1 : 1;
        });
}