class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] newArr = new int[num2 - num1 + 1];

        for(int i=0; i<newArr.length; i++) {
                newArr[i] = numbers[i + num1];
        }

        return newArr;

    } // solution()
} // end class

/*
    풀이방법 : 
    1. numbers[num1] ~ numbers[num2] 까지가 필요하다.
    2. 자른 배열을 담을 배열을 준비하자 -> newArr
    3. newArr 의 크기 -> num2 - num1 + 1
    4. newArr[0] = numbers[num1] ~ newArr[num2 - num1] = numbers[num2]
    5. 즉, 반복문으로 처리해보자

        for(int i=0; i<=num2-num1; i++) {
            newArr[i] = numbers[num1 + i];
        }

    6. newArr을 반환해주면 끝
*/
