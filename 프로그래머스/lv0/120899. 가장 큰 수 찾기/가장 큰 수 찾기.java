import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];

        int[] copy = array.clone();
        Arrays.sort(copy);

        int num = copy[copy.length -1];

        result[0] = num;
        result[1] = Arrays.binarySearch(array, num);

        return result;
    }
}
/*
    접근법 :
    결과 값이 들어갈 배열을 선언해준다. 크기 : 2
    .clone()
        매개변수로 들어온 배열[일반자료형] 을 깊은 복사
    Arrays.sort()
        복사된 배열의 정렬
    Arrays.binarySearch();
        자바에서의 배열은 indexOf()를 지원하지 않는다. -> 그래서 이 메소드를 쓴다.
        이진 탐색 알고리즘을 이용한 메소드 int[정렬된 배열]의 값, int형인자를 받아 위치를 찾아준다. 
        
    
    다른 접근법 :
    반복문을 통한 깊은복사 구현

    class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];
        int max = 0;
        int index = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        
        result[0] = max;
        result[1] = index;

        return result;
    }
}
*/