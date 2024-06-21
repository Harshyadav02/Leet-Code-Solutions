# Write your MySQL query statement below

SELECT  MAX(num) AS num FROM MyNumbers WHERE num IN (SELECT NUM FROM MyNumbers GROUP BY NUM HAVING COUNT(NUM) =1); 