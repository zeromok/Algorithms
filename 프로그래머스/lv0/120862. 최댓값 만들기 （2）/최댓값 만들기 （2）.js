function solution(numbers) {
    // 들어온 배열의 원소들의 곱 중 최댓값을 만들 수 있는 원소
    // 다른말로 곱했을 때 가장 큰 정수 2개 뽑아라?
    // 각각의 원소들을 곱해보면서 접근?
    
    // 나올 수 있는 가장 작은 수 초기화
    let max = -100000000;
    
    // 이중for문을 통해 각각의 원소들을 곱함
    for(let i=0; i<numbers.length - 1; i++) {
        for(let j=i+1; j<numbers.length; j++) {

            // 비교 후 최댓값 초기화
            if(max < numbers[i] * numbers[j]) {
                max = numbers[i] * numbers[j];
            }

        }
    }
    
    return max;
}
/*
    다른 접근법 :
    들어온 배열을 정렬 시킨 후 앞 요소 2개, 뒤 요소 2개 비교 하는 방법
    어차피 최댓값은 둘중 하나...

    function solution(numbers) {

        // 오름차순 정렬
        let sortArr = numbers.sort( (a, b) => {return b - a});

        let case1 = sortArr[0] * sortArr[1];
        let case2 = sortArr[sortArr.length - 1] * sortArr[sortArr.length - 2];

        return case1 > case2 ? case1 : case2;

    }
*/