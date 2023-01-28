function solution(my_string, num1, num2) {
    const arr = my_string.split("");
    
    let str1 = arr[num1];
    let str2 = arr[num2];
    
    arr.splice(num1, 1, str2);
    arr.splice(num2, 1, str1);
    
    return arr.join("");
}
/*
    접근법 : 
    1. 문자열의 정해진 자리에 있는 문자들을 서로 바꾼다.
    2. 문자열 -> 배열 === .split("");
    3. 정해진 자리에 있는 문자들 변수에 담아놓기 === str1, str2
    4. 기존에 있던 문자 제거하고 바뀔 문자로 체인지 === .splice(기존문자index, 1, 바뀔 문자);

    알고보면 다 알고있고 쉽게 접근해 풀 수있는 문제이다.
    적용이 어려워 그렇지...

    arr.splice( start [, deleteCount [, item1 [, item2 [, ... ]]]] )
    - start
        배열의 변경을 시작할 인덱스(음수인 경우 끝에서 부터)
    - delete
        (From start) 제거할 요소의 수, 0 = 제거x
    - item
        배열의 추가할 요소


    다른 접근법 :
    replace(), substring() 으로도 접근을 못하고,, 다른 접근법이 보이지 않는다 ㅠㅠ
    좀 더 생각보자
*/