function solution(s){
    let arr = s.toUpperCase().split("");

    let p = arr.filter( e => e==='P').length;
    let y = arr.filter( e => e==='Y').length;

    return p === y;

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

}