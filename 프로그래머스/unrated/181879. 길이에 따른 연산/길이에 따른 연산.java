class Solution {
    public int solution(int[] num_list) {
        int temp = 1;
        if(num_list.length >= 11) {
            for(int item : num_list) {
                temp += item;
            }
            return temp - 1;
        }else if(num_list.length <= 10) {
            for(int item : num_list) {
                temp *= item;
            }
            return temp;
        }
        return temp;
    }
}