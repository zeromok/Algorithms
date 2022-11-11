-- 코드를 입력하세요
/*
    oracle 의 (숫자 또는 날짜데이터 -> 문자) 함수인 TO_CHAR(데이터, 출력형식) 사용

    IN 연산자 : WHERE 절 내에서 특정값 여러개를 선택하는 SQL 연산자
        OR 연산자로 표현 가능하다.
            WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
*/
SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD, 'YYYY-MM-DD')
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;