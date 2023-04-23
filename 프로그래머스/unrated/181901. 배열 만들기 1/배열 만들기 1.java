class Solution {
    public int[] solution(int n, int k) {
        int[] arr = new int[n / k];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = k*(i + 1);
        }
        return arr;
    }
}