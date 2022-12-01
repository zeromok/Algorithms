import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        
        for(int i=1; i<=n; i++) {                        
            list.add(i);                                
        }
        
        return list.size();
    }
}
/*
    접근법 :
    1. js처럼 배열에 넣어 해결하는 방법
    2. 매겨변수로 들어온 n 의 약수를 담기위한 ArrayList 선언
    3. 왜? -> 약수의 개수를 모르니깐 가변배열을 이용하자
    
    다른 풀이 :
    class Solution {
        public int solution(int n) {
            int result = 0;
            for(int i=1; i<=n; i++) {
                if(n%i == 0) {
                    result++;
                }
            }
            return result;
        }
    }
*/