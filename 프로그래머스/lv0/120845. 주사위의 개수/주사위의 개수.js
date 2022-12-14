function solution(box, n) {
    let result = box.map( (e) => {return Math.floor(e/n)} ).reduce( (acc, cur) => {return acc * cur },1 );
    return result;
}
/*
    접근법 :
    처음에는 박스와 주사위의 부피를 구해 나누려했는데 잘못된 접근 같아 수정했다.

    가로에 들어갈 주사위 개수 X 세로에 들어갈 주사위 개수 X 높이에 들어갈 주사위 개수 = 해결?
        box배열 안에는 가로, 세로, 높이 순으로 들어가 있다.
        원소를 하나씩 뽑아 n으로 나누어 나온 3개의 수를 곱하면 될것같다.
    
    .map() 을 사용해 각각의 원소들을 n으로 나눈 수로 매핑
    .reduce() 를 사용해 매핑된 원소들의 곱을 구해 반환시켜줬다.

    
    다른 접근 : 좀 더 풀어서 접근해보면?

    1. 배열의 value를 순회하는 for of를 사용해 접근해 보았다.
    function solution(box, n) {
        let result = 1;
        for(let e of box) {
            result = result * Math.floor(e/n)
        }
        return result;
    }
*/