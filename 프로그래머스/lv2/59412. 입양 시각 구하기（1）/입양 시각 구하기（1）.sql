-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(DATETIME, 'FMHH24')) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
GROUP BY TO_CHAR(DATETIME, 'FMHH24')
HAVING TO_CHAR(DATETIME, 'FMHH24') BETWEEN 9 AND 19
ORDER BY HOUR;
/*
    접근법 :
    09시 부터 19:59분까지 즉, 19시까지의 DATETIME 의 값들을 모아야한다.
    절의 순서를 따라가며 해결해보자
    FROM ANIMAL_OUTS
        -> 테이블에서
    GROUP BY TO_CHAR(DATETIME, 'FMHH24')
        -> TO_CHAR 로 시간을 포맷해 가져와 시간별로 데이터를 그룹화
    HAVING TO_CHAR(DATETIME, 'FMHH24') BETWEEN 9 AND 19
        -> 그 중 9~19시까지의 데이터만 골라냄
    SELECT TO_NUMBER(TO_CHAR(DATETIME, 'FMHH24')) AS HOUR, COUNT(*) AS COUNT
        -> 숫자정렬의 오류때문에 Char -> Number 타입변경
        -> COUNT() : 시간별로 그룹화된 데이터 전체행 건수를 반환
    ORDER BY HOUR;
        -> TO_CHAR() 로 가져온 시간데이터의 정렬, 문자열이기 때문에 위 TO_NUMBER 활용
*/