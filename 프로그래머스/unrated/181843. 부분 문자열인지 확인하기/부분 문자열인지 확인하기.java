class Solution {
    public int solution(String my_string, String target) {
        if (target.length() > my_string.length()) return 0;
        for (int i = 0; i <= my_string.length() - target.length(); i++) {
            int j;
            for (j = 0; j < target.length(); j++) {
                if (my_string.charAt(i + j) != target.charAt(j)) break;
            }
            if (j == target.length()) return 1;
        }
        return 0;
    }
}