-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, replace(replace(replace(replace(SEX_UPON_INTAKE, 'Intact Male', 'X'),'Intact Female', 'X'), 'Neutered Male', 'O'),'Spayed Female', 'O') AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
/*
    접근법 :
    SEX_UPON_INTAKE(중성화 여부) 컬럼의 값이
        Neutered Male, Spayed Female 일땐, 'O'
        Instact Male, Instact Female 일땐, 'X'
    문자열을 치환해주는 함수를 찾아 사용해보자 -> replace()

    사용법 :
    replace(컬럼명, '찾을문자', '변환문자')
    replace() 의 확장 -> regexp_replace() [정규식사용가능]

    다른접근법 :
    각각 매핑시켜주다보니 함수중복으로 인해 쿼리가 길어져 다른 함수를 쓸 수 있지않을까?
    해서 찾아본 다른방법들
    
    ORACLE 의 CASE 문 :
    SELECT ANIMAL_ID, NAME,
        CASE
            WHEN 
            (OK)WHEN SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE '%Spayed%'
                LIKE, OR 사용
            (OK)WHEN REGEXP_LIKE (SEX_UPON_INTAKE, '^Neutered|^Spayed')
                10g 부터 나온 LIKE의 확장 -> REGEXP_LIKE() 사용
            (OK)WHEN SEX_UPON_INTAKE IN ('Neutered Male', 'Spayed Female')
                IN 을 사용한 방법 -> 값을 정확히 알고있을 때 적합하므로, 이 문제에서는 비추천
            THEN 'O'
            ELSE 'X'
        END AS 중성화
    FROM ANIMAL_INS
    ORDER BY ANIMAL_ID;

*/