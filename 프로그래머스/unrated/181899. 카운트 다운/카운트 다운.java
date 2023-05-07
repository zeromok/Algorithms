class Solution {
    public int[] solution(int start, int end) {
        int[] temp = new int[start - end + 1];
        int index = 0;
        for (int i = start; i >= 0; i--) {
            temp[index++] = i;
            if (i == end) break;
        }
        return temp;
    }
}