/*
    내가 푼 코드이지만 뭔가 이상해 수정하려 한다.
    이상한점 : 반복문 안에 선언한 i 가 필요 없어 보임
               반복문을 조금 수정하면 될 것 같다.
*/
class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        /* for(int i=0; 0<=n; i++){
            if(n%2 == 0){
                sum += n;
            }
            n--;
        } */

        // 변수 i를 활용하는 쪽으로 수정
        for(int i=n; 0<=i; i--){
            if(n%2 == 0){
                sum += n;
            }
            n--;
        }
        return sum;
    }
}

