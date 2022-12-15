class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code-1; i<cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
/*
    접근법 :
    조건에 맞는 문자를 받기위한 문자열 선언 -> answer
    for문의 조건으로 code의 배수 번째만 순회하게끔 조건식을 써준다.
    for문을 돌며 인덱스를 이용해 문자를 뽑아 저장 후 반환

    다른 접근법 :
    1. 인터넷에서 찾은 방법인데 공부하기 좋을것 같아 가져온 방법
        새로운 메소드들이 참 많다.
    
    * .rangg()
        : 첫번째 파라미터 부터 두번째 파라미터(<)까지 순차적으로 정렬된 Stream 을 반환
    * .filter()
        : 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업
    * .mapToObj()
        : 기본형 스트림을(Int, Long, Double) Stream 으로 변환
    * Stream.collect()
        : 데이터의 중간처리(filter, map, ...) 후 마지막에 원하는 형태로 반환해주는 역할
    * Collectors.joining()
        : 스트림에서 작업한 결과를 하나의 타입 으로 이어줌

    import java.util.stream.Collectors;
    import java.util.stream.IntStream;
    Class Solution {
        public static String solution(String cipher, int code) {
            return IntStream.range(0, cipher.length())
                            .filter( (num) -> {return num%code == code - 1; })
                            .mapToObj( (num) -> {return String.valueOf(cipher.charAt(num));})
                            .collect(Collectors.joining());
        }
    }


    위 예제를 일반 for문으로 변환해 보자 -> 이해를 위해...완벽한 변환은 아니다.
    String result = "";
    for(int i=0; i<cipher.length(); i++) {
        if(i%code == code - 1) {
            result += cipher.charAt(i);
        }
    }
    return result;
*/