class Solution {
    public String solution(String my_string, int n) {
        return (String) my_string.subSequence(my_string.length() - n, my_string.length());
    }
}