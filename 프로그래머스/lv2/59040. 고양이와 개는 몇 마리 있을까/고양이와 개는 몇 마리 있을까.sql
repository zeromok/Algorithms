-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(*) AS COUNT
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;
/*
    각 절의 실행순서도 알고있어야 더 수월하게 풀 수 있는 문제 같다.
    1. FROM
    2. [WHERE]
    3. [GROUP BY]
    4. [HAVING]
    5. SELECT
    6. [ORDER BY]
*/