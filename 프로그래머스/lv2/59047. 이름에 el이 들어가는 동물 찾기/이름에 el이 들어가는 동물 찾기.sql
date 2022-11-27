-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'Dog' AND UPPER(NAME) LIKE '%EL%'
ORDER BY NAME;
/*
    AND : 앞, 뒤 두 가지 조건을 모두 만족해야만 검색가능
    LIKE : ~와 같은 조건 Ex) %EL% - 컬럼 값에 위치 상관없이 EL이 들어가면 뽑아와줌
    UPPER(컬럼) : 컬럼의 값을 모두 대문자로 변환
*/