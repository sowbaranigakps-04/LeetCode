
SELECT *
FROM Cinema
WHERE MOD(id,2) = 1 and description<>'boring'
order by rating desc