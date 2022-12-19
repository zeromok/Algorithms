function solution(n) {
    let result = (n + "").split('');
    return result.map(Number).reverse();
}
/*
    접근법 :
    매개변수로 들어온 자연수(n)를 문자열로 만든다. -> n + ""
    문자열로 변환된 자연수를 자릿수마다 배열로 만든다. -> .split('');
    배열의 각 요소를 숫자로 만들기 -> .map(Number);
    배열의 역순 -> reverse();
*/