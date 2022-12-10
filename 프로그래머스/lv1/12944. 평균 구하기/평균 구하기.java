class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum/arr.length;
    }
}
/*
    접근법 :
    평균 = 요소들의 합 / 배열의 길이
    정석적인? 풀이 방법으로 풀어 보았다.

    다른 접근법 : 향상된 포문 사용
    class Solution {
        public double solution(int[] arr) {
            int sum = 0;
            for(int element : arr) {
                sum += element;
            }
            return (double)sum/arr.length;
        }
    }
*/