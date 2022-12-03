function solution(array) {
    let result = array.sort( (a, b) => {return a-b;});
    let answer = array[Math.floor(array.length/2)]
    return answer;
}