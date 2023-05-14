class Solution {
    public int solution(String myString, String pat) {
        String str = myString.toUpperCase();
        String strPat = pat.toUpperCase();
        return str.contains(strPat) ? 1 : 0;
    }
}