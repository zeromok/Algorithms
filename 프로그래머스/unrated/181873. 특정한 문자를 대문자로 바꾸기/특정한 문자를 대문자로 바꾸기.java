class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(String.valueOf(alp), String.valueOf(alp).toUpperCase());
    }
}