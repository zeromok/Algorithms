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

    위 문제에서 ANIMAL_TYPE 이 cat, dog 만 있어서 제대로 나왔지만,
    TYPE 가 여러가지 일 경우, WHERE ANIMAL_TYPE IN ('cat', 'dog') 를 넣어주면 더 완벽하다.
*/