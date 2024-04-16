## 문제

Given an array of integers`nums`and an integer`target`, return_indices of the two numbers such that they add up to`target`.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

### 예시

#### Input
    nums = [2,7,11,15], target = 9
#### output
    [0,1]

- - -

#### Input
    nums = [3,2,4], target = 6
#### output
    [1,2]

- - -

#### Input
    nums = [3,3], target = 6
#### output
    [0,1]

### 제약조건
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

### Follow-up
Can you come up with an algorithm that is less than`O(n2)`time complexity?


## 문제 분석하기

주어진 배열(nums) 의 요소중 두개의 합이 target 과 일치할 경우 해당 요소들의 인덱스를 배열로 반환하는 문제이다.
(문제의 유효한 답은 하나다.)

제약조건과 안내사항을 보면 $O(n^2)$ 미만의 복잡도를 가진 알고리즘을 사용해 접근해야한다.

1. 배열의 요소중 하나를 고정 시켜놓고
2. 나머지 요소들을 순회하면서 target 과 같은지 비교
3. 같으면 요소들의 인덱스를 배열로 반환


## 슈도코드 작성하기

```java
for(nums 길이) {
	// 인덱스 0 부터 차례대로 고정 시킴
	int curr = 현재값
	
	for(nums 길이) {
		// 현재 값과 중복될 수 없다.
		// 현재 인덱스와 같은 인덱스면 스킵해야한다.
		if(현재 인덱스면?) 스킵;
		
		// 인덱스 반환
		if(현재값 + 비교값 == target) return 현재값과 비교값의 인덱스를 배열로 반환;
	}
}
```


## 코드 구현하기

```java
public static int[] solution(int[] nums, int target) {  
	
	for (int i = 0; i < nums.length; i++) {  
		// 고정값 설정
		int curr = nums[i];  
		
		// 비교할 요소들을 순회 할 for문
		for (int j = 0; j < nums.length; j++) {  
			// 고정값과 인덱스가 같다면 스킵
			if (i == j)  
				 continue;  
			
			//  고정값 + 비교값 == target 이면, 배열로 만들어 반환
			if (curr + nums[j] == target)  
				return new int[] {i, j};  
		}  
		
	}  
	return null;  
}
```


## 다른 접근법

#### 위 방식의 문제점
1. 위와같이 접근해도 통과가 되나, 이중포문으로 인해 시간복잡도가 $O(n^2)$ 가 되어 매우 비효율적이다.
2. 중복된 요소가 있을경우 분기해야한다.
3. 조회시 요소 하나하나 비교한다.

> 중복된 요소가 있을 경우 효율적으로 처리할 수 있고 요소를 즉시 조회할 수 있는 **Map** 을 사용해 접근해보자.

#### `x + y = target` 와 `x = target - y` 는 같다.

#### `x + y = target` 와 `y + x = target` 는 같다.


### 슈도코드

```java
Map 선언

for(nums길이만큼) {
	int curr = 현재값 저장;
	int x = target - curr;
	
	if(맵에서 x를 키로 요소를 찾아서 있으면?) {
		return new int[]{map.get(x), 현재값 인덱스};
	}
	
	return map.put(현재값, 인덱스);
}
return null;
```

### 풀이

```java
class Solution {  
    public int[] twoSum(int[] nums, int target) {  
	    
		Map<Integer, Integer> map = new HashMap<>();  
		
		for (int i = 0; i < nums.length; i++) {  
			int curr = nums[i];  
			int x = target - curr;  
			
			if (map.containsKey(x)) {  
				return new int[] {map.get(x), i};  
			}
			
			map.put(curr, i);  
		}
		
		return null;  
    }
}
```


