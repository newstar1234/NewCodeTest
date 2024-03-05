-- 코드를 입력하세요
SELECT 
    CASE CAR_TYPE
        WHEN '세단' THEN '세단'
        WHEN 'SUV' THEN 'SUV'
        WHEN '승합차' THEN '승합차'
        WHEN '트럭' THEN '트럭'
        WHEN '리무진' THEN '리무진'
    END AS CAR_TYPE,
    COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR 
WHERE 
    OPTIONS LIKE '%통풍시트%' OR 
    OPTIONS LIKE '%열선시트%' OR 
    OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;