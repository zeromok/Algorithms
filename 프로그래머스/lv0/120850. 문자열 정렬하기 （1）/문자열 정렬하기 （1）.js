function solution(my_string) {
    let result = my_string.replaceAll(/[^0-9]/g, "").split("").map(Number).sort();
    return result;
}
/*
    접근법 :
    필요한 함수들을 모아 활용 그래도 점점 잘 활용하는 것 같다.

    문자열에서 알파벳 제거 -> replaceAll();
    문자 하나,하나 배열에 넣기 -> split();
    문자로 이루어진 배열 정수로 바꾸기 -> map();
    정렬 후 반환 -> sort();
*/