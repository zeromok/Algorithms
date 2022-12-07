class Solution {
    public int solution(String my_string) {
       my_string = my_string.replaceAll("[^0-9]", "");

            int answer = 0;

            for(int i=0; i<my_string.length(); i++) {
                answer += my_string.charAt(i) - '0';
            }           

            return answer;      
        }
}
/*
    접근법 :
    replaceAll() -> 정규식을 이용해 숫자가 아닌 문자들을 치환 -> 숫자만 남게 된다.
    my_string.charAt(i) - '0' -> 문자열을 순회하며 문자 하나하나를 char타입으로 뽑아와 -'0' 을 해줘 int타입으로 변환

    다른 풀이 :
    String.valueOf() -> 지정값을 String으로 변환
    Integer.parseInt() -> String타입의 숫자를 int타입으로 변환
    Integer.parseInt(String.valueOf(my_string.charAt(i)));

    알아보기 :
    parseInt() : 반환값 원시타입
    valueOf()  : 반환값 래퍼타입 -> new Intger(Intger.parseInt());
    오토박싱/언박싱으로 뭘 써도 상관없음, 하지만 객체 생성 오버헤드가 있을 수 있음
*/