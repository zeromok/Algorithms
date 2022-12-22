function solution(s){

    let arr = s.toUpperCase().split("");

    let p = arr.filter( e => e === 'P').length;
    let y = arr.filter( e => e === 'Y').length;

    return p === y;

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

}
/*
    접근법 :
        - 들어온 문자열을 대문자나, 소문자로 모두 바꿔서 접근해보자
            ( .toUpperCase() / .toLowerCase() ) -> **문자열에만 적용 가능
        - 문자 하나하나 배열로 만들어 접근해보자
            ( .split() )
        - 배열로 만든 문자열에서 문자들을 찾아 개수 비교 후 값 반환
            ( .filter() 함수의 콜백함수로 내가 찾을 문자만 뽑아내 개수비교 )


    다른 접근법 :
        - split() 안 매개변수로 문자를 주게 되면 -> 그 문자 기준으로 잘라진 배열 반환
          즉, 문자 기준으로 반환된 배열의 길이에서 -1 을 하면 그 문자의 개수가 된다.
          if 첫 문자, 끝 문자에 구분자가 있으면 빈 요소를 반환 해준다.

        function solution(s) {

            let p = s.toUpperCase().split("P").length - 1;
            let y = s.toUpperCase().split("Y").length - 1;

            return p === y;

        }
*/
