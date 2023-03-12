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
/*
* 접근법
* 위와 같이 배열로 접근하는 방법 말고도
* ArrayList 로 접근하는 방법이 있다.
* Ex)
* import java.util.Arrays;
* int result = Arrays.asList(str).indexOf("Kim");
* */