function solution(sides) {
    newArr = sides.sort();
    return newArr[newArr.length - 1] >= newArr[0] + newArr[1] ? 2 : 1;
}