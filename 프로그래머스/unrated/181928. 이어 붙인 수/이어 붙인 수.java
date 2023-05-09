class Solution {
    public int solution(int[] num_list) {
        String evenNum = "";
        String oddNum = "";
        for(int item : num_list) {
            if (item % 2 == 0) evenNum += item;
            else oddNum += item;
        }
        return Integer.parseInt(evenNum) + Integer.parseInt(oddNum);
    }
}