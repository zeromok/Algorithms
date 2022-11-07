class Solution {
    
    public static int gcd(int a, int b){
            while(b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
    
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int num = denum1 * num2 + denum2 * num1;
        int den = num1 * num2;
        int result = Solution.gcd(num, den);
        answer[0] = num/result;
        answer[1] = den/result;
        return answer;
    }
}