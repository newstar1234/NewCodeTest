-- 코드를 입력하세요
SELECT 
ANIMAL_ID,
NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'dog' 
AND NAME LIKE '%EL%'
ORDER BY NAME ASC;