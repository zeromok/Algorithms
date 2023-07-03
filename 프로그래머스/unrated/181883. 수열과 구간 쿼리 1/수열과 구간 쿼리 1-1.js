function solution(arr, queries) {
  queries.map(([s, e]) => {
    Array.from(
      { length: e - s + 1 }, // 길이가 s <= 길이 <= e 에 부합하는 배열 생성
      (_, idx) => (arr[s + idx] += 1) // 생성된 배열의 인덱스를 s 로부터 더하면서 arr[s] 부터 arr[e] 까지 +1을 해준다.
    );
  });
  return arr;
}