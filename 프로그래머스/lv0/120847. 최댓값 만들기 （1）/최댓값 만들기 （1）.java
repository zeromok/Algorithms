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
/*
    접근법 :
    1. 들어온 배열의 요소 중 하나를 기준점으로 잡고 -> max
    2. 배열을 순회하면서 요소 각각 곱한 값들을 max 와 비교
    3. max 보다 크면 max 값 교체 
*/