class Solution {
    public String solution(String str1, String str2) {
        return IntStream.range(0, str1.length())
                .mapToObj(idx -> String.valueOf(str1.charAt(idx)) + str2.charAt(idx))
                .reduce("", String::concat);
    }
}