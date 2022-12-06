function solution(price) {
    
        if(price >= 500000) {
        price *= 0.8;
    } else if(price >= 300000) {
        price *= 0.9;
    } else if(price >= 100000) {
        price *= 0.95;
    }
    return Math.floor(price);
    
}
/*
    짚고 넘어가기 :
    처음에 if() 소괄호 안 표현식을 (100000 < price < 300000) 이렇게 해서 헤맸다.
    위 처럼 할 경우 price 는 100000 이상인 수 모두, 300000 이하인 수 모두를 의미 즉, 저 사이의 값을 의미하지 않음.
    (100000 <= price && price > 300000) -> 이런식으로 접근하는게 맞음

    다른 풀이 :
    Ex) 할인율 20%일 때, price * 0.8 === price - (price * 0.2)
    
    function solution(price) {
        if(price >= 500000) {
            return Math.floor(price - (price * 0.2));
        } else if(price >= 300000) {
            return Math.floor(price - (price * 0.1));
        } else if(price >= 100000) {
            return Math.floor(price - (price * 0.05));
        }
        return Math.floor(price);
    }
*/