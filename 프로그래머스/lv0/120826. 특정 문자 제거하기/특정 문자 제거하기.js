function solution(my_string, letter) {
    let arr = my_string.split('');
    for(let i=0; i<arr.length; i++) {
        if(arr[i] === letter) {
            arr.splice(i, 1);
            i--;
        }
    }
    return arr.join('');
}