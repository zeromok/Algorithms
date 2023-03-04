class Solution {
    public int solution(int n) {
        int result = 0;

        for (int i = 4; i <= n; i++) { // n개 이하의 수들 돌면서...
            int count = 0;
            for (int j = 1; j <= i; j++) { // 5일때 5까지 돌면서...

                if (i % j == 0) { // 약수를 찾아 -> 5 % 1, 2, 3, 4, 5 === 0
                    count++;
                }
            }
            if (count >= 3) { // 약수가 3보다 크거나 같으면...
                result++;
            }
        }
        return result;
    }
}