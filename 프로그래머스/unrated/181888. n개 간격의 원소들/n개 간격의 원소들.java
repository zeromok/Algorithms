class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[(int)Math.ceil((double) num_list.length / n)];
        int temp = 0;
        for(int i = 0; i<num_list.length; i += n){
            result[temp] = num_list[i];
            temp++;
            if (temp == result.length) break;
        }
        return result;
    }
}