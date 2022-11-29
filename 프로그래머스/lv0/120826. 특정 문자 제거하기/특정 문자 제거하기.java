class Solution {
    public String solution(String my_string, String letter) {
        String result = my_string.replaceAll(letter, "");
        return result;
    }
}