-- 코드를 입력하세요
SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE TO_CHAR(JOINED, 'YYYY') = 2021 AND AGE BETWEEN 20 AND 29;

/*

    =================================================================
    1. 또 다른 방법
       EXTRACT() : 일자 정보에서 년, 월, 일과 같은 내용 뽑아오는 함수
    =================================================================

    SELECT COUNT(USER_ID) AS USERS
    FROM USER_INFO
    WHERE EXTRACT(YEAR FROM JOINED) = 2021 AND AGE BETWEEN 20 AND 29;

    =================
    2. COUNT() 알아보기
    =================
    COUNT(*)
    : 조회된 전체행 건수를 반환

    COUNT(column)
    : 컬럼의 값이 null 인 행은 카운트 하지 않는다.

    COUNT(DISTINCT column)
    : 중복제거 후 컬럼의 값 건수를 반환

*/