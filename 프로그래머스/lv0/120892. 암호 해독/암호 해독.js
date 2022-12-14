function solution(cipher, code) {
    let result = '';
    let ans = cipher.split('')
    for(let i=code-1; i<ans.length; i+=code) {
        result += ans[i];
    }
    return result;
}
/*
    접근법 :
    들어온 문자열을 배열로 만들어 -> .split();
    code의 배수들만 뽑아 문자열을 만들어 반환 -> for문


    다른 접근법 :
    처음에는 filter()를 사용해보려다 인덱스에서 막혀 헤매다 해결...!
    
    1. .filter(); 사용
        배열의 각 요소에 대해 콜백함수를 실행 후 true인 값만 반환

    function solution(cipher, code) {
        let result = cipher.split('').filter( (data, index, arr) => {
            return (index+1)%code === 0;
        });
        return result.join('');
    }

    2. .reduce(); 사용
        배열의 각 요소에 대해 콜백함수를 실행 후 마지막 누적값(acc)를 반환
        
    function solution(cipher, code) {
        let result = cipher.split('').reduce( (acc, cur, index) => {
            return (index+1)%code === 0 ? acc + cur : acc;
        }, '');
        return result;
    }
*/
