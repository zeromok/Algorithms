class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0) {
                result = i;
                break;
            }
            else {
                result = -1;
            }
        }
        return result;
    }
}