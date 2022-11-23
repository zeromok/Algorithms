function solution(dot) {
    let x = dot[0];
    let y = dot[1];
    
    if(x > 0 && y > 0) {
        return 1;
    }else if(x < 0 && y > 0) {
        return 2;
    }else if(x < 0 && y < 0) {
        return 3;
    }else {
        return 4;
    }
}
/*
    =========
    다른 풀이 -> 삼항연산자 사용
    =========
    let x = dot[0];
    let y = dot[1];

    if(x>0){
        return y>0 ? 1 : 4;
    }
    return y>0 ? 2 : 3;
*/