function solution(n) {
    let result = [];

    for (let i = 4; i <= n; i++) { // n개 이하의 수들 돌면서...

        let count = 0;

        for (let j = 1; j <= i; j++) { // 5일때 5까지 돌면서...

            // 약수를 찾아 -> 5 % 1, 2, 3, 4, 5 === 0
            if (i % j === 0) count++;
        }

        if (count >= 3) { // 약수가 3보다 크거나 같으면...
            result.push(i);
        }
    }
    return result.length;
}