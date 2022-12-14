function solution(rsp) {
    let result = '';
    let ans = rsp.split('');
    for(let e of ans) {
        if(e === '5') {
            result += 2;
        }else if(e === '2') {
            result += 0;
        }else {
            result += 5;
        }
    }
    return result;
}
