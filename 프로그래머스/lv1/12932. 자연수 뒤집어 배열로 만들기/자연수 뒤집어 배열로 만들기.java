import java.util.*;
class Solution {
    public ArrayList solution(long n) {
        String result = n + "";
        char[] str = result.toCharArray();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = str.length-1; i>=0; i--) {
            list.add(str[i] - '0');
        }
        return list;
    }
}
/*
    접근법 :
    들어온 자연수(n)를 문자열로 변환 -> n + ""
    문자열의 문자들을 문자타입 배열로 변환 -> toCharArray();
    배열을 하나 만들어(길이 = 문자타입 배열의 길이) 역순 저장(int 타입으로...)


    다른 접근법 :
    ArrayList 를 쓰지 않고 접근해 보았다.
    
    class Solution {
        public ArrayList solution(long n) {
            String result = n + "";
            char[] str = result.toCharArray();

            int[] list = new int[str.length];

            for(int i = str.length-1; i>=0; i--) {
                list[str.length-1-i] = (str[i] - '0');
            }
            return list;
        }
    }
*/