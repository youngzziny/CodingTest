SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
FROM
    (
    SELECT *
    FROM ANIMAL_INS
    WHERE SEX_UPON_INTAKE LIKE 'Intact%'
    ) I,
    (
    SELECT *
    FROM ANIMAL_OUTS
    WHERE SEX_UPON_OUTCOME NOT LIKE 'Intact%'
    ) O
WHERE I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY O.ANIMAL_ID;