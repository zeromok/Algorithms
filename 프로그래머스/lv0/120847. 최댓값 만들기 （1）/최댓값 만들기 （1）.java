class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0];
        for(int i=0; i<numbers.length - 1; i++) {
            if(numbers[i] * numbers[i+1] > max) {
                max = numbers[i] * numbers[i+1];
            }
        }
        return max;
    }
}