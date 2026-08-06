# Write your MySQL query statement below
select distinct  tweet_id from tweets
where LENGTH(content)>15;