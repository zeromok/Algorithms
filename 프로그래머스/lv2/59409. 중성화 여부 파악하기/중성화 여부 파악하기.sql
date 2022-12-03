-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, replace(replace(replace(replace(SEX_UPON_INTAKE, 'Intact Male', 'X'),'Intact Female', 'X'), 'Neutered Male', 'O'),'Spayed Female', 'O') AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;