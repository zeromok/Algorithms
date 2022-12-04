class Solution {
    public String solution(String my_string) {
        String result = my_string.replaceAll("[a,e,i,o,u]", "");
        return result;
    }
}