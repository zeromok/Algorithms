class Solution {
    public int solution(int hp) {
           if(5 > hp) {
        return hp/3 + hp%3;   
       }else if(3 > hp) {
           return hp;
       }else {
           int x = hp/5;
           int y = hp%5;
           return x + y/3 + y%3;
       }
    }
}