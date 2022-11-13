
/*
    또 다른 방법 -> filter() 사용
    (왜 자꾸 JS의 함수들을 사용 못 하는걸까...ㅠ)

    function solution(array, n) {
        return array.filter( (e) => {
            return (e == n);
        }).length;
    }
    
*/
function solution(array, n) {
    newArr = [];
    array.forEach((e) => {
        if(e == n){
            newArr.push(n);
        }
    });
    return newArr.length;
}