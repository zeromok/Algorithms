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
/*
    접근법 :
    들어온 문자열을 배열로 만들어 각각의 요소들을 if문으로 비교해 새로운 문자열 반환

    .split()을 사용해 들어온 문자열을 배열로 만들어줌
    for of문을 사용해 배열의 요소로 바뀐 문자들을 순회함
    for문 안 if문으로 분기처리하면서 새로운 문자열에 매핑되는 문자 넣어줌
    새로운 문자열 반환


    다른 접근법 : 내장함수를 써보자

    1. map() 사용
        콜백함수 안에 분기문을 써서 풀어보았다 하지만 이 코드도 내 입장에서는 부족하다.
        
    function solution(rsp) {
        let result = rsp.split('').map( (data) => {
            if(data === '5'){
                return '2';
            }else if(data === '2') {
                return '0';
            }else {
                return '5';
            }
            return data;
        });
        return result.join('');
    }

    2. 삼항연산자를 이용해 보자
        뭔가 좀 깔끔해 졌다...!

    function solution(rsp) {
        let result = rsp.split('').map( (data) => {
           return ((data === '5') ? '2' : (data === '2') ? '0' : '5');
        });
        return result.join('');
    }

    3. .replace() 사용 -> 굳..진짜 최종...
        2.번으로 접근하다보니 replace()가 생각나 접근해 보았다.
        정규식으로 찾을 문자를 넣고, 바뀔문자에 콜백함수를 넣어주었다.

    function solution(rsp) {
        let result = rsp.replace(/5|2|0/g, (data) => {
            return  ( (data === '5') ? '2' : (data === '2') ? '0' : '5' );
        });
        return result;
    }
*/
