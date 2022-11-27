-- 코드를 입력하세요
SELECT NAME, COUNT(NAME) AS COUNT
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME) >= 2
ORDER BY NAME;
/*
    접근 방법 :
    1. 중복값 구하기, 중복값 카운트, COUNT 값 >= 2, 이름순

    2. COUNT(NAME) = NAME의 값을 카운트해 반환(NULL 제거)
                     Ex) 소괄호안 (컬럼)이 있으면 NULL값 제거 후 반환

    3. GROUP BY NAME = 이름별~ 처럼 그룹화
                       Ex) 이름별 COUNT(NAME)[중복값] 으로 나타내준다.

    4. HAVING = GROUP BY 로 그룹화 된 그룹들 중 지정된 조건에 일치하는 조건 반환 (2차 필터링)
                Ex) 두 번 이상 쓰인 이름을 반환해 줘야하니 COUNT(NAME) >= 2 (AS 쓰면 오류남 주의)

    각 절의 실행순서도 알고있어야 더 수월하게 풀 수 있는 문제 같다.
    1. FROM
    2. [WHERE]
    3. [GROUP BY]
    4. [HAVING]
    5. [ORDER BY]
    6. SELECT
*/