import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
/*
    접근법 :
    가변배열을 설정해 for문을 통해 나온 약수들을 넣어줌

    다른 접근법 :
    1. 주어진 수의 절반을 대상으로 확인
        약수는 본인을 제외하고 n/2 보다 클 수 없기 때문에... -> 성능이 좋아진다.
        
    class Solution {
        public ArrayList solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<=n/2; i++) {
                if(n%i == 0) {
                    list.add(i);
                }
            }
        list.add(n);
        return list;
        }
    }
*/