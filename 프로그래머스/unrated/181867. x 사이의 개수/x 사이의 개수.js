function solution(myString) {
    return myString.endsWith('x') ?
        myString.split("x", -1).map(item => item.length)
        : myString.split("x").map(item => item.length);
}