class Solution {
    public int solution(int[] numbers) {

        // 문제에서 나올 수 있는 최소값 초기화
        int max = -100000000;
        
        // 중첩for문을 통해 각각의 원소들의 곱을 구해 max와 비교
        for(int i=0; i<numbers.length -1 ; i++) {
            for(int j=i+1; j<numbers.length; j++) {

                // 최댓값 재정의
                if(max < numbers[i] * numbers[j]) {
                    max = numbers[i] * numbers[j];
                }

            }
        }

        // 최댓값 반환 
        return max;
    }
}
/*
    다른 접근법 :
    import java.util.Arrays;
    class Solution {
        public int solution (int[] numbers) {

            // 오름차순 정렬
            Arrays.sort(numbers);

            // 가장 큰 요소의 곱
            int case1 = numbers[0] * numbers[1];

            // 가장 작은 요소의 곱 - * - = +
            int case2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

            return case1 > case2 ? case1 : case2;
        }
    }
*/