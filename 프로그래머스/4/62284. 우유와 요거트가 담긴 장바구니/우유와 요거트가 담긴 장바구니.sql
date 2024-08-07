SELECT M.CART_ID
FROM
    (
    SELECT DISTINCT CART_ID
    FROM CART_PRODUCTS
    WHERE NAME LIKE 'Milk'
    ) M,
    (
    SELECT DISTINCT CART_ID
    FROM CART_PRODUCTS
    WHERE NAME LIKE 'Yogurt'
    ) Y
WHERE M.CART_ID = Y.CART_ID
ORDER BY CART_ID