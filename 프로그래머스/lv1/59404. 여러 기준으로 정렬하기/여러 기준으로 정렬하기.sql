-- 코드를 입력하세요
-- NAME 기준으로 정렬(ASC = 사전순) 후 이름이 같을 경우 보호를 나중에 시작한 동물(DATETIME이 최근 = DESC) 정렬 
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC;