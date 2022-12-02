import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        
        for(int i=1; i<=n; i+=2) {                        
            list.add(i);                                
        }
        
        return list;
    }
}
/*
    접근법 :
    그냥 배열로 풀어보려다 방법이 떠오르지 않아 크기가 가변적인 ArrayList를 사용
    1. ArrayList를 사용하기 위해 임포트 구문
    2. 메소드의 반환타입 맞춰주기
    3. 메소드 안에 ArrayList 객체 생성해주기 -> list
    4. for문의 조건식 만으로 list에 홀수만 넣기 -> (int i=1; i<=n; i+=2)
    5. list 반환
*/
