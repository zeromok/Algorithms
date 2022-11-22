class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;
        int[] newArr = new int[2];
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2 == 0) {
                a += 1;
            }else {
                b += 1;
            }
        }
        newArr[0] = a;
        newArr[1] = b;
        return newArr;
    }
}