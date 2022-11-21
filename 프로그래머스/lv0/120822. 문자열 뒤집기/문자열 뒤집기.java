class Solution {
    public String solution(String my_string) {
        char[] newArr = my_string.toCharArray();
        char[] result = new char[newArr.length];
        for(int i=0; i<newArr.length; i++) {
            result[newArr.length -1 -i] = newArr[i];
        }
        String ans = new String(result);
        return ans;
    }
}