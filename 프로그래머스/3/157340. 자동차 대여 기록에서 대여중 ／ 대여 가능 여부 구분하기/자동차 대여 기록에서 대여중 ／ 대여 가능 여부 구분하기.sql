SELECT CAR_ID, AVAILABILITY
FROM (
    SELECT CAR_ID, AVAILABILITY, ROW_NUMBER() OVER(PARTITION BY CAR_ID ORDER BY AVAILABILITY DESC) AS RN
        FROM (
                SELECT CAR_ID, 
                       CASE
                       WHEN '2022-10-16' BETWEEN TO_CHAR(START_DATE, 'YYYY-MM-DD') 
                                         AND TO_CHAR(END_DATE, 'YYYY-MM-DD') 
                                         THEN '대여중'
                       ELSE '대여 가능'     
                       END AS AVAILABILITY
                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY    
             )
        ORDER BY CAR_ID DESC
    )
WHERE RN = 1;