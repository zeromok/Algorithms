function solution(n){
    let result = n.toString().split('');
    let sum = 0;
    for(let e of result) {
        sum += parseInt(e);
    }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

    return sum;
}