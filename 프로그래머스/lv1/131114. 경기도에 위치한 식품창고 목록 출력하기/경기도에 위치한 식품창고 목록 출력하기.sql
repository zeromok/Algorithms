-- 코드를 입력하세요
/*
    NULL값을 치환해주는 NVL() 함수를 사용해 해결 ***오라클에서만 제공하는 함수!
    NVL(조회할 컬럼, null일경우 치환할 값) 
*/
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, NVL(FREEZER_YN, 'N') FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID;