class Solution {
    public int[] solution(int[] numbers, String direction) {

        // 회전시킨 배열이 될 newArr 초기화
        int[] newArr = new int[numbers.length];

        if(direction.charAt(0) == 'r') {
            
            // 반복문을 순회하며, newArr[1]... 부터 numbers[0]... 넣어줌
            for(int i=0; i<newArr.length - 1; i++) {
                newArr[i + 1] = numbers[i];
            }
            // [0] 은 비어있으니, numbers의 마지막 요소 넣어준다.
            newArr[0] = numbers[numbers.length - 1];
            
            return newArr;
            
        }else if(direction.charAt(0) == 'l') {
            
            // 반복문을 순회하며, newArr[0]... 부터 numbers[1]... 넣어줌
            for(int i=0; i<newArr.length - 1; i++) {
                newArr[i] = numbers[i + 1];
            }

            // 마지막 요소는 비어있으니, numbers의 첫번째 요소 넣어준다.
            newArr[newArr.length - 1] = numbers[0];
            
            return newArr;
            
        }else {
            return numbers;
        }

    } // main
} // end class