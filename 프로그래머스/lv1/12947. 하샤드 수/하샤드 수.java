class Solution {
    public boolean solution(int x) {
        String str = "" + x;
        int sum = 0;
        String[] arr = str.split("");
        for(int i=0;i<arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return x%sum == 0;
    }
}
/*
    접근법 :


    다른 접근법 :
    
*/