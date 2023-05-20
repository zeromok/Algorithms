
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public static int[] solution(int[] num_list) {
        int secondLast = num_list[num_list.length - 2];
        int last = num_list[num_list.length - 1];
        int[] result = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, result, 0, num_list.length);

        if (secondLast < last) {
            result[num_list.length] = last - secondLast;
        } else {
            result[num_list.length] = last * 2;
        }

        return result;
    }
}