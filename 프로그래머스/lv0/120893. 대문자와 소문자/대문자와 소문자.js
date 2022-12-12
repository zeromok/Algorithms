function solution(my_string) {
    let answer = '';
    let result = my_string.split('');
    for(let i=0; i<my_string.length; i++) {
        if(my_string[i] === my_string[i].toUpperCase()) {
            answer += my_string[i].toLowerCase();
        }else{
            answer += my_string[i].toUpperCase();
        }
    }
    return answer;
}