class Solution {
    public int[] solution(int start, int end) {
        int[] arr = new int[(end-start)+1];
        for (int i = start; i <= end; i++) {
            arr[i - start] = i;
        }
        return  arr;
    }
}