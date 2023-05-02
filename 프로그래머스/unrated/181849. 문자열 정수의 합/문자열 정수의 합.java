class Solution {
    public int solution(String num_str) {
        int result = 0;
        for (String item : num_str.split("")) {
            result += Integer.parseInt(item);
        }
        return result;
    }
}