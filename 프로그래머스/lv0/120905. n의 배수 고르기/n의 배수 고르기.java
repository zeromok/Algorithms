import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n == 0) {
                list.add(numlist[i]);
            }
        }
        return list;
    }
}
/*
    접근법 :
    n의 배수만 넣을 배열이 필요하다 But 몇개나 넣을지는 미정 -> ArrayList를 사용하자
*/