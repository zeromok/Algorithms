class Solution {
    public String solution(String rsp) {
        String result = "";
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == '5') {
                result += '2';
            }else if(rsp.charAt(i) == '2') {
                result += '0';
            }else {
                result += '5';
            }
        }
        return result;
    }
}