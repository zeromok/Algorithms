class Solution {
    public String solution(String my_string) {
        String result = my_string.replaceAll("[a,e,i,o,u]", "");
        return result;
    }
}
/*
    접근법 :
    위에서는 JS에서 얻은 힌트를 사용해 쉽게 풀었다.

    다른 풀이 :
    class Solution {
        public String solution(String my_string) {

            String str = "aeiou";
            for(char c : str.toCharArray()) { -> str 을 문자하나하나 char타입의 배열로 변환
                my_string = my_string.replace(String.valueOf(c), "");
                -> String.valueOf(c) (char타입의 원소(c)를 String으로 변환)
                -> replace() 를 사용해 치환
            }
            return my_string;

        }
    }
*/