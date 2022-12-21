class Solution {
    public long solution(long n) {

        double sqrt = Math.sqrt(n);
        long result = (long)Math.pow( (sqrt + 1), 2 );

        if(sqrt == Math.floor(sqrt)) {
            return result;
        }

        return -1;
    }
}
/*
    접근법 :
        - long타입으로 들어오고, long타입으로 반환 **
        - 제곱근, 제곱을 구하기 위해 Math class 사용
        - 자바에서 Math class 는 double 타입으로 반환

    .sqrt() : 소수점인지 아닌지 판별하려고 double로 받음
    .pow() : double 타입의 반환값을 메소드 반환값인 long타입으로 형변환


    다른 접근법 :
        좀더 간결한 코드는 없나..?
    
    - 간결하지만 알아보기 쉽다고는 볼 수 없을것 같다...
    class Solution {
        public long solution(long n) {
            
            double sqrt = Math.sqrt(n);

            return sqrt == Math.floor(sqrt) ? (long)Math.pow( (sqrt + 1), 2 ) : -1;

        }
    }
*/