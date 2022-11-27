-- 코드를 입력하세요
SELECT ANIMAL_TYPE, NVL(NAME,'No name') AS NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
/*
    접근 방법 :
    1. NAME 의 NULL값을 No name 으로 나오게 만들어야 한다.
    2. NULL 값을 치환해주는 함수 = NVL() 을 사용해보자
    3. NVL(컬럼, NULL일 경우 치환 할 값)
       Ex) NVL(NAME,'No name') : NAME컬럼 안 NULL값을 모두 'No name'로 치환
*/