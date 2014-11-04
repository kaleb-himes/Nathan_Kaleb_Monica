# TAKE 2:

#Q1 real: 
SELECT candy_bar, count(candy_bar) as cnt 
FROM `favorite_food` group bycandy_bar order by cnt desc;

#Q2 real:
SELECT ice_cream, count(ice_cream) as cnt 
FROM `favorite_food` group byice_cream order by cnt desc;

#Q3 real:
SELECT day_of_week, count(day_of_week) as cnt 
FROM `favorite_time` group by day_of_week order by cnt;

#Q4 real:
SELECT breakfast_cereal, count(breakfast_cereal) as cnt 
FROM `favorite_food` group by breakfast_cereal order by cnt desc;



#Q5 real:
select count(season) as cnt 
from favorite_time 
where (season) = 'summer';

#Q6 real:
SELECT day_of_week, count(day_of_week) as cnt 
FROM `favorite_time` group by day_of_week order by cnt;

#Q7 real:
SELECT lucky_number, COUNT(lucky_number) AS cnt 
FROM favorite_item GROUP BYlucky_number ORDER BY cnt DESC;

#Q8 real:
SELECT hated_course, count(hated_course) as cnt 
FROM `favorite_course` group byhated_course order by cnt desc;

#Q9 real:
SELECT sport_to_watch_tv, count(sport_to_watch_tv) as cnt 
FROM `favorite_sport`group by sport_to_watch_tv order by cnt desc;

#Q10 real:
SELECT lucky_number, count(lucky_number) as cnt 
FROM `favorite_item` group bylucky_number order by cnt desc;

#Q11 real:
SELECT count(*) as cnt 
FROM favorite_food 
where (juice) = (fruit);

#Q12 real:
SELECT avg(number_pets) as avg 
from student_data;

#Q13 real:
select count(lucky_number) as cnt 
from favorite_item 
where (lucky_number % 13) = 0;

#Q14 real:
SELECT year, color, count(color) as cnt 
FROM favorite_car 
where (year) > 1999 group by color order by cnt desc; 

# OMFG TWENTIETH CENTURY NOT 21st FRACK

SELECT year, color, count(color) as cnt 
FROM favorite_car 
where (year) < 2000 group by color order by cnt desc; 
	      #	 ^^^^^^
	      #	 !!!!!!

#Q15 real:
select count(lucky_number) as cnt 
from favorite_item 
where (lucky_number % 9) = 0;

# not taking this again too time consuming and I know I will make some stupid
# mistake trying to rush through it.