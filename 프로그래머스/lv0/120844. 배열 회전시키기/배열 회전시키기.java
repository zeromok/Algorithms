class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] newArr = new int[numbers.length];
        if(direction.charAt(0) == 'r') {
            
            for(int i=0; i<newArr.length - 1; i++) {
                newArr[i + 1] = numbers[i];
            }
            newArr[0] = numbers[numbers.length - 1];
            
            return newArr;
            
        }else if(direction.charAt(0) == 'l') {
            
            for(int i=0; i<newArr.length - 1; i++) {
                newArr[i] = numbers[i + 1];
            }
            newArr[newArr.length - 1] = numbers[0];
            
            return newArr;
            
        }else {
            return numbers;
        }
    }
}