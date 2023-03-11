class Solution {
    public String solution(String[] str) {
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Kim")) {
                result = i;
            }
        }
        return "김서방은 " + result + "에 있다";
    }
}