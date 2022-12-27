class Solution {
    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        
        answer[0] = x;
        for(int i=1; i<n; i++) {
            answer[i] = answer[ i - 1] + x;
        }

        return answer;
    }
}
/*
    접근법 :
    매개변수들 int 타입, 반환타입 long[] 주의하며 접근하자

    1. long 타입의 빈 배열하나 생성 후 길이는 매개변수로 들어온 n
    2. x, x+x, x+x+x 이렇게 배열에 담겨야함 [0]은 X 고정
    3. for 문을 이용해 1번째 인덱스 부터 들어가게끔 표현식을 넣어주고
    4. 수행되는 코드가 x 를 더해주게끔 만들어준다.


    다른 접근법 :
    long 타입의 변수(element)를 생성해 접근하는 방법을 써보았다.

    class Solution {
        public long[] solution(int x, int n) {

            long[] answer = new long[n];
           
           long element = x;
            for(int i=0; i<n; i++) {
                answer[i] = element;
                element += x;
            }

            return answer;
        }
    }
*/
