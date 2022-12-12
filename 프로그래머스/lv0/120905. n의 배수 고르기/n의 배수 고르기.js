function solution(n, numlist) {
    let result = numlist.filter( (element) => { return element%n === 0 });
    return result;
}