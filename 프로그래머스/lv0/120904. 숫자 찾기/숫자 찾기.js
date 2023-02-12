function solution(num, k) {
    // 정수num -> 문자열배열num
    // 문자열배열num 에서 k와 같은 정수를 찾아 반환
    
    let str = num.toString().split("");
    
    let search = str.indexOf("" + k);
    
    if(search === -1) return -1;
    
    return search + 1;
} // end
/*
    접근법 :
    정수num -> 문자열num = .toString();
    문자열num -> 배열num = .split("");
    배열num 에서 문자열로 바꾼 k 의 위치를 찾아 반환 = .indexOf("" + k);


    다른접근법 :
    정수num -> 문자열num = .toString();
    문자열num -> 문자열배열num = .split("");
    문자열배열num -> 정수배열num = .map( (item) => Number(item) );
    정수배열num 에서 정수k 찾기 = .indexOf(k); / 있으면 인덱스, 없으면 -1

    function solution(num, k) {

        let arr = num.toString().split("").map((item) => Number(item)).indexOf(k);
        return (arr === -1) ? -1 : arr + 1;

    } // end

*/


