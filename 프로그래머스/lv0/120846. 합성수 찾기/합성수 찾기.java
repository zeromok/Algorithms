class Solution {
    public int solution(int n) {
        int result = 0;


        // n개 이하의 수들 돌면서...
        // 4이하는 합성수가 될 수 없다.
        for (int i = 4; i <= n; i++) {
            // 약수의 개수 카운트
            int count = 0;

            for (int j = 1; j <= i; j++) { // Ex) 5일때 5까지 돌면서...

                if (i % j == 0) { // 약수를 찾아 -> 5 % 1, 2, 3, 4, 5 == 0
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
/*
* 합성수 : 약수의 개수가 3개 이상 (약수 > 2 || 약수 >= 3)
* 매개변수가 들어오면 매개변수 이하의 수에서 합성수의 개수를 구해랴
* */