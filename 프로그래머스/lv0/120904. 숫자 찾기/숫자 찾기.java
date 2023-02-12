class Solution {
    public int solution(int num, int k) {
        
        String str = Integer.toString(num);
        
        if(str.indexOf("" + k) == -1) return -1;
        
        return str.indexOf("" + k) + 1;
        
    }
} // end
/*
    접근법 :
    int num -> String num = Integer.toString(num);
    문자열num 에서 int k 찾기 = .indexOf(); / ("" + k) 로 타입 맞춰주기

    다른 접근법 :
    class Solution {
        public int solution(int num, int k) {

            String str = Integer.toString(num);
            int result =  str.indexOf("" + k);

            return result == -1 ? -1 : result + 1;

        }
    }
*/