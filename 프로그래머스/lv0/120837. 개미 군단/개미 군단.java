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
/*
    접근법 :
    몫을 구하는 나머지 연산자 -> /
    나머지를 구하는 모듈러 연산자 활용 -> %

    hp/5 -> 장군개미의 수
    hp%5/3 -> 병정개미의 수
    hp%5%3 -> 일개미의 수

    hp가 5보다 작거나, 3보다 작을 때에 값도 넣어준다.

    다른 접근법 :
    class Solution {
        public int solution(int hp) {
            if(5 > hp) {
                return hp/3 + hp%3;   
            }else if(3 > hp) {
                return hp;
            }else {
                int x = hp/5;
                int y = hp%5/3;
                int z = hp%5%3;
                return x + y + z;
            }
        }
    }
*/