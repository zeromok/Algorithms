function solution(order) {
    // 박수횟수 = return
    // 3, 6, 9 의 배수 카운트 즉, 3의 배수 카운트?
    
    let result = 0;
    
    let str = order.toString();
    
    [...str].forEach( item => { if( Number(item)%3 === 0 && Number(item)>=3 ) result++ } )
    
    return result;
}