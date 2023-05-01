class Solution {
    public int solution(int[] numbers, int n) {
        int temp = 0;
        for(int item : numbers) {
            temp += item;
            if(temp > n) return temp;
        }
        return temp;
    }
}