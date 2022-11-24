class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] newArr = new int[num2 - num1 + 1];
        for(int i=0; i<newArr.length; i++) {
                newArr[i] = numbers[i + num1];
            }
        return newArr;
        }
    }
