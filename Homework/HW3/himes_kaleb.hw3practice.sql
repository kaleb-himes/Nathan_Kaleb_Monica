#Q2 practice:
SELECT tree, count(tree) as cnt 
FROM `favorite_item` group by tree order by cnt desc;

#Q3 practice:
SELECT month_of_year, count(month_of_year) as cnt 
FROM `favorite_time` group by month_of_year order by cnt;

#Q4 practice:
SELECT next_to_learn, count(next_to_learn) as cnt 
FROM `favorite_language`group by next_to_learn order by cnt;

#Q5 practice:
select count(lucky_number) as cnt 
from favorite_item 
where (lucky_number % 2) = 0;