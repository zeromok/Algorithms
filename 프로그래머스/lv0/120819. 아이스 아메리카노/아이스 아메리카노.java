class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = (int)Math.floor(money/5500);
        answer[1] = money%5500;
        return answer;
    }
}