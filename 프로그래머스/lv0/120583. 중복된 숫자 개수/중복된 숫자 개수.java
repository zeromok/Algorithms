/*
    Inhance for(햫상된 포문)을 사용해보자
    class Solution {
        public int solution(int[] array, int n) {
            int count = 0;
            for(int i : array){
                if(i == n){
                    count++;
                }
            }
            return count;
        }// solution
    }// end class
*/

class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i] == n){
                count++;    
            }// if
        }// for

        return count;
        
    }// solution
}// end class