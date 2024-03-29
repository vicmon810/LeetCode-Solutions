SELECT s.user_id, 
ROUND(AVG
(if
(c.action="confirmed",1,0)
),2) AS confirmation_rate
FROM Signups as s LEFT JOIN Confirmations 
AS c on s.user_id = c.user_id 
GROUP BY user_id;