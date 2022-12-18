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
/*
    접근법 :
    들어온 자연수를 문자열로 바꾼 후 -> .toString();
    문자 하나하나 배열로 만들어 -> .split();
    각각의 원소를 뽑아 정수로 바꾼 후 -> parseInt();
    합해서 반환 -> sum


    다른 접근법 :
    숫자 -> 문자 : + "" (빈 문자열을 더해 문자로 바꾸어줌)
    문자 -> 숫자 : - '0'(유니코드를 활용한 바꾸기 방법)

    function solution(n) {
        let result = (n + "").split('');
        let sum = 0;
        
        for(let e of result) {
            sum += e - '0';
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        console.log('Hello Javascript')

        return sum;
    }
*/