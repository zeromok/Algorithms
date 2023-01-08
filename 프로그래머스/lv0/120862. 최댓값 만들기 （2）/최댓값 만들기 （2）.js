function solution(numbers) {
    // 들어온 배열의 원소들의 곱 중 최댓값을 만들 수 있는 원소
    // 다른말로 곱했을 때 가장 큰 정수 2개 뽑아라?
    // 각각의 원소들을 곱해보면서 접근?
    
    let max = -100000000;
    
    for(let i=0; i<numbers.length - 1; i++) {
        for(let j=i+1; j<numbers.length; j++) {
            if(max < numbers[i] * numbers[j]) {
                max = numbers[i] * numbers[j];
            }
        }
    }
    
    return max;
     
}