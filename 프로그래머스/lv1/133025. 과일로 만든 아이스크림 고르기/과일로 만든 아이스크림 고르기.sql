-- 코드를 입력하세요
SELECT FLAVOR
FROM FIRST_HALF
WHERE
    TOTAL_ORDER > 3000
AND
    FLAVOR
IN
    (
        SELECT FLAVOR
        FROM ICECREAM_INFO
        WHERE INGREDIENT_TYPE = 'fruit_based'
    )
ORDER BY TOTAL_ORDER DESC;

/*
    상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.

    1. 출제자가 원하는 정보 : [조건1]총주문량(TOTAL_ORDER) > 3000, [조건2]주성분(INGREDIENT_TYPE) = 과일(fruit_based), [ORDER BY]총주문량이 큰 순서대로(내림차순 = DESC)
    2. AND 를 사용하여 조건끼리 이어주고, IN, 서브쿼리 를 사용해 [조건2]에 맞는 정보 매핑
*/