import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String result = my_string.replaceAll("[^0-9]", "");
        int[] arr = new int[result.length()];
        for(int i=0; i<result.length(); i++) {
            arr[i] = result.charAt(i) - '0';
        }
        Arrays.sort(arr);
        return arr;
    }
}
/*
    접근법 :
    문자열에서 숫자빼고 다 치환 -> replaceAll();
    리턴타입인 int[] 배열 생성, 크기는 치환된 문자열의 길이 -> arr
    반복문을 돌며 원소 하나하나 빼내 int타입으로 변환 해 넣기 -> for()
    int[]배열 정렬 후 반환 -> Arrays.sort();
*/