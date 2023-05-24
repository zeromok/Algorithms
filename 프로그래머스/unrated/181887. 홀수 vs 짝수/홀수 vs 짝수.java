class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i=0; i<num_list.length; i++) {
            if(i % 2 == 0) even += num_list[i];
            else if(i % 2 == 1) odd += num_list[i];
            else return num_list[i];
        }
        return odd > even ? odd : even;
    }
}