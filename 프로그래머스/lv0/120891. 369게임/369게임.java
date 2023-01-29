class Solution {
    public int solution(int order) {
        
        int result = 0;
        
        String str = Integer.toString(order);
            
        for(String item : str.split("")) {
            if( Integer.parseInt(item)%3 == 0 && Integer.parseInt(item) >= 3 ) result++;
        };
            
        return result;
    }
}
/*
    접근법 : [Refactoring]
    class Solution {
        public int solution(int order) {
            int result = 0; -> 반환될 박수횟수

            숫자 -> 문자열타입의 배열
            String[] strOrder = Integer.toString(order).split("");

            배열을 순회하며 비교(3, 6, 9)
            for(String item : strOrder){
                if( Integer.parseInt(item)%3 == 0 && Integer.parseInt(item) >= 3 ) result++; 
            };

            return result;
        }
    }


    다른 접근법 :
    class Solution {
        public int solution(int order) {
            int answer = 0;
            String strOrder = "" + order;
            for (int i = 0; i < strOrder.length(); i++) {
                char tempChar = strOrder.charAt(i);

                if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                    answer++;
                }
            }
            return answer;
        }
    }
*/