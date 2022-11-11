/*
    문제를 보자마자 생각난 for문, if문을 사용해 풀어보았다.

    answer ++; 을 써도 문제가 없었다.
*/
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > height){
                answer += 1;    // answer++;
            }
        }
        return answer;
    }
}