class Solution {
    public String solution(String my_string, String letter) {
        String result = my_string.replace(letter, "");
        return result;
    }
}
/*
    접근법 :
    JAVA의 replaceAll(정규식, 치환문자); 을 사용하였다.
    매개값으로 정규식을 받기 때문에 사용에 주의가 필요해 보여 
    my_string.replace(기존문자, 치환문자); 으로 사용하는게 더 좋을것 같다.
*/