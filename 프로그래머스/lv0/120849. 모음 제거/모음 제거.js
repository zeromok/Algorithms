function solution(my_string) {
    let str = 'aeiou';
    let result = my_string.split("");
    let answer = result.filter( (data) => {
        return !str.includes(data);
    });
    return answer.join('');       
}