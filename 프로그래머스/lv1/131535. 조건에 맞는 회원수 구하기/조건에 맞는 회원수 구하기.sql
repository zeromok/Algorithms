-- 코드를 입력하세요
SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE TO_CHAR(JOINED, 'YYYY') = 2021 AND AGE BETWEEN 20 AND 29;


/*

    ==================
    EXTRACT() 사용하기
    : 날짜 타입에서 년도, 월, 일, 시간, 분, 초 등을 뽑아오는 함수
    ==================
    SELECT COUNT(*) AS USERS
    FROM USER_INFO
    WHERE EXTRACT(YEAR FROM JOINED) = 2021 AND AGE <= 29 AND AGE >= 20;

    ================
    COUNT() 알아보기
    ================
    COUNT(*)
    - 조회된 전체 행 건수를 반환

    COUNT(column)
    - 컬럼의 값이 NULL인 행은 카운트 하지 않는다.

    COUNT(DISTINCT column)
    - 중복되는 컬럼 값을 제거 후, 컬럼 카운트

*/