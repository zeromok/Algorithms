function solution(my_string, n) {
    let answer = [];
    for(let i=0; i<my_string.length; i++){
        answer.push(my_string[i]);
        for(let j=1; j<n; j++) {
            answer.push(my_string[i]);
        }
    }
    return answer.join('');
}