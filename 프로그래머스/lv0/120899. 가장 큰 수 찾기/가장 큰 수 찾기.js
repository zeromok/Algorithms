function solution(array) {
    let result = []
    let copy = [...array].sort( (a, b) => {return a-b;});
    result.push(copy[copy.length - 1]);
    result.push(array.indexOf(copy[copy.length - 1]));
    return result;
}