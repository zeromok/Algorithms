-- 코드를 입력하세요
-- <> : !=, not like
-- 예문에서 오름차순으로 출력되어 있어서 ORDER BY 컬럼(ASC, DESC) : Default Value ASC
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION <> 'Aged'
ORDER BY ANIMAL_ID;

