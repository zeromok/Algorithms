import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];
        int[] copy = array.clone();
        Arrays.sort(copy);
        int num = copy[copy.length -1];
        result[0] = num;
        result[1] = Arrays.binarySearch(array, num);
        return result;
    }
}