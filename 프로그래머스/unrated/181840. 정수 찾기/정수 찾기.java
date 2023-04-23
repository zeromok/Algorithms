class Solution {
    public int solution(int[] num_list, int n) {
        for (int j : num_list) {
            if (j == n) {
                return 1;
            }
        }
        return 0;
    }   
}
