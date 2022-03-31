# Write your MySQL query statement 
SELECT distinct email FROM person Group by email HAVING COUNT(email)>1; 