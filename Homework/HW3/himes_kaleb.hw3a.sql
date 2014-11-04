########### REAL ATTEMPT 1 ##############
#Q1 real: 
SELECT animal, count(animal) as cnt 
FROM `favorite_item` group by animal order by cnt desc;

#Q2 real:
SELECT color, count(color) as cnt 
FROM `favorite_item` group by color order by cnt desc;

#Q3 real:
select count(color) as cnt 
from favorite_item 
where (color) = 'red';

#Q4 real:
SELECT juice, count(juice) as cnt 
FROM `favorite_food` group by juice order by cnt desc;

#Q5 real:
SELECT winter_olympic_sport, count(winter_olympic_sport) as cnt 
FROM `favorite_sport` group by winter_olympic_sport order by cnt desc;

#Q6 real:
select count(season) as cnt 
from favorite_time 
where (season) = 'fall';

#Q7 real:
select count(color) as cnt 
from favorite_item 
where (color) = 'blue';

#Q8 real:
select count(birth_city) as cnt 
from student_data 
where (birth_city) = 'belgrade';

#Q9 real:
select count(season) as cnt 
from favorite_time 
where (season) = 'spring';

#Q10 real:
select count(home_city) as cnt 
from student_data 
where (home_city) = 'great falls';

#Q11 real:
select distinct count(lucky_number) as cnt 	# woops missed this one and I know why.
from favorite_item;							# distinct selected all occurances not 
											# unique values as I had intended

#Q12 real:
select count(recently_learned) as cnt 
from favorite_language 
where(recently_learned) = 'php';

#Q13 real:
select count(lucky_number) as cnt 
from favorite_item 
where (lucky_number % 2) = 0;

#Q14 real:
SELECT model, year, count(model) as cnt 
from favorite_car group by model orderby year desc;

#Q15 real:
SELECT count(*) as cnt 
FROM favorite_car 
where (color) = 'red' or (color) = 'blue';
