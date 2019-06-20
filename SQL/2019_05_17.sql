
create database test2;
use test2;
create table student(
	id int(10) primary key auto_increment,
    name varchar(20),
    birth varchar(20),
    sex varchar(10)
);
alter table student 
change column age birth varchar(20); 
	
insert into Student values(default , '赵雷' , '1990-01-01' , '男');
insert into Student values(default , '钱电' , '1990-12-21' , '男');
insert into Student values(default, '孙风' , '1990-05-20' , '男');
insert into Student values(default, '李云' , '1990-08-06' , '男');
insert into Student values(default, '周梅' , '1991-12-01' , '女');
insert into Student values(default, '吴兰' , '1992-03-01' , '女');
insert into Student values(default, '郑竹' , '1989-07-01' , '女');
insert into Student values(default, '王菊' , '1990-01-20' , '女');

select * from student;

create table course(
	id int(10) primary key auto_increment,
	name varchar(20),
    tid int(10)
);

insert into course values(default, '语文' , 2);
insert into course values(default, '数学' , 1);
insert into course values(default, '英语' , 3);


create table teacher(
	id int(10) primary key auto_increment,
	name varchar(20)
);

insert into Teacher values(default, '张三');
insert into Teacher values(default , '李四');
insert into Teacher values(default , '王五');

create table score(
	sid int(10),
    cid int(10),
    score int(10)
);

insert into score values('01' , '01' , 80);
insert into score values('01' , '02' , 90);
insert into score values('01' , '03' , 99);
insert into score values('02' , '01' , 70);
insert into score values('02' , '02' , 60);
insert into score values('02' , '03' , 80);
insert into score values('03' , '01' , 80);
insert into score values('03' , '02' , 80);
insert into score values('03' , '03' , 80);
insert into score values('04' , '01' , 50);
insert into score values('04' , '02' , 30);
insert into score values('04' , '03' , 20);
insert into score values('05' , '01' , 76);
insert into score values('05' , '02' , 87);
insert into score values('06' , '01' , 31);
insert into score values('06' , '03' , 34);
insert into score values('07' , '02' , 89);
insert into score values('07' , '03' , 98);

select count(cid) from score where cid = 2

------------------------------------------------------------------------------------
use test2;

--  1 查询“ 01 ”课程比" 02 "课程成绩高的学生的信息及课程分数
SELECT s.*,sc1.score,sc2.score
FROM student s
LEFT JOIN score sc1 ON sc1.sid = s.id AND sc1.cid = 1
LEFT JOIN score sc2 ON sc2.sid = s.id AND sc2.cid = 2
WHERE sc1.score > sc2.score;

-- 1.1 查询同时存在" 01 "课程和" 02 "课程的情况
SELECT s.*,sc1.score,sc2.score
FROM student s
LEFT JOIN score sc1 ON sc1.sid = s.id AND sc1.cid = 1
LEFT JOIN score sc2 ON sc2.sid = s.id AND sc2.cid = 2
WHERE sc1.cid IS NOT NULL AND sc2.cid IS NOT NULL;

-- 1.2 查询存在" 01 "课程但可能不存在" 02 "课程的情况(不存在时显示为 null )
SELECT s.*,sc1.score,sc2.score
FROM student s
LEFT JOIN score sc1 ON sc1.sid = s.id AND sc1.cid = 1
LEFT JOIN score sc2 ON sc2.sid = s.id AND sc2.cid = 2
WHERE sc1.cid IS NOT NULL AND sc2.cid IS NULL;

-- 1.3 查询不存在" 01 "课程但存在" 02 "课程的情况
SELECT s.*,sc1.score,sc2.score
FROM student s
LEFT JOIN score sc1 ON sc1.sid = s.id AND sc1.cid = 1
LEFT JOIN score sc2 ON sc2.sid = s.id AND sc2.cid = 2
WHERE sc1.cid IS NULL AND sc2.cid IS NOT NULL;

-- 2. 查询平均成绩大于等于 60 分的同学的学生编号和学生姓名和平均成绩
SELECT s.id,s.name,AVG(sc.score)
FROM student s
LEFT JOIN score sc ON s.id = sc.sid 
GROUP BY s.id,s.name
HAVING  AVG(sc.score) >= 60;

-- 3. 查询在 SC 表存在成绩的学生信息
SELECT DISTINCT s.*
FROM student s
LEFT JOIN score sc ON s.id = sc.sid
WHERE sc.score IS NOT NULL;

-- 4. 查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩(没成绩的显示为 null )
SELECT s.id,s.name,COUNT(sc.cid),SUM(sc.score)
FROM student s
LEFT JOIN score sc ON s.id = sc.sid
GROUP BY s.id,s.name;

-- 4.1 查有成绩的学生信息
SELECT s.id,s.name,COUNT(sc.cid),SUM(sc.score)
FROM student s
LEFT JOIN score sc ON s.id = sc.sid
GROUP BY s.id,s.name
HAVING SUM(sc.score) IS NOT NULL;

-- 5. 查询「李」姓老师的数量 
SELECT *
FROM TEACHER 
WHERE name like '李%';

-- 6. 查询学过「张三」老师授课的同学的信息
SELECT s.*
FROM student s
LEFT JOIN score sc ON sc.sid = s.id
LEFT JOIN course c ON c.id = sc.cid
LEFT JOIN teacher t ON t.id = c.tid
WHERE t.name = '张三';

-- 7. 查询没有学全所有课程的同学的信息 
SELECT s.id,s.name
FROM score sc
LEFT JOIN student s ON sc.sid = s.id
GROUP BY s.name,s.id
HAVING COUNT(sc.cid) < 3;
-- GROUP BY s.*會發生錯誤
/*SELECT s.*
FROM student s
WHERE s.id IN(
SELECT sid 
FROM score 
GROUP BY sid
HAVING COUNT(cid) < 3);*/

-- 8. 查询至少有一门课与学号为" 01 "的同学所学相同的同学的信息
SELECT DISTINCT s.*
FROM student s
INNER JOIN score sc ON s.id = sc.sid AND sc.cid IN(
SELECT cid FROM score WHERE sid = 1);

-- 9. 查询和" 01 "号的同学学习的课程完全相同的其他同学的信息 
SELECT s.*
FROM student s
INNER JOIN score sc ON s.id = sc.sid
GROUP BY s.id
HAVING COUNT(sc.cid) = (
SELECT COUNT(cid) FROM score sc WHERE sc.sid = 1);

-- 10. 查询没学过"张三"老师讲授的任一门课程的学生姓名 
SELECT s.name
FROM student s
INNER JOIN score sc ON s.id = sc.sid
INNER JOIN course c ON sc.cid = c.id
INNER JOIN teacher t ON t.id = c.tid
WHERE t.id = 1;

-- 11. 查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩 
SELECT s.id,s.name,AVG(sc.score)
FROM student s
INNER JOIN score sc ON s.id = sc.sid AND sc.score <= 60
GROUP BY s.id
HAVING COUNT(sc.score) >= 2;

-- 12. 检索" 01 "课程分数小于 60，按分数降序排列的学生信息
SELECT s.*,sc.score
FROM student s
INNER JOIN score sc ON s.id = sc.sid
WHERE sc.cid = 1 AND sc.score <= 60
ORDER BY sc.score DESC;

-- 13. 按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
SELECT s.name,SUM(sc.score),AVG(sc.score)
FROM score sc
LEFT JOIN student s ON s.id = sc.sid
GROUP BY s.name
ORDER BY AVG(sc.score) DESC;

-- 14. 查询各科成绩最高分、最低分和平均分：
SELECT c.name,MAX(sc.score),MIN(sc.score),AVG(sc.score)
FROM score sc
LEFT JOIN course c ON c.id = sc.cid 
GROUP BY c.name;

-- 15.按各科成绩进行排序，并显示排名， Score 重复时保留名次空缺
SELECT * ,RANK() OVER(ORDER BY score DESC) 排名
FROM score;

-- 15.1 按各科成绩进行排序，并显示排名，Score 重复时合并名次
SELECT * ,DENSE_RANK() OVER(ORDER BY score DESC)排名
FROM score;

-- 16. 查询学生的总成绩，并进行排名，总分重复时保留名次空缺
SELECT s.name,SUM(sc.score),RANK() OVER(ORDER BY SUM(sc.score) DESC)排名
FROM score sc
INNER JOIN student s ON s.id = sc.sid
GROUP BY s.name;

-- 16.1 查询学生的总成绩，并进行排名，总分重复时不保留名次空缺
SELECT s.name,SUM(sc.score),DENSE_RANK() OVER(ORDER BY SUM(sc.score) DESC)排名
FROM score sc
INNER JOIN student s ON s.id = sc.sid
GROUP BY s.name;

-- 17. 统计各科成绩各分数段人数：课程编号，课程名称，[100-85]，[85-70]，[70-60]，[60-0] 及所占百分比
SELECT sc.cid,c.name,
COUNT(CASE WHEN sc.score >= 85 AND sc.score <100 THEN sc.sid END) AS '[100-85]',
ROUND(COUNT(CASE WHEN sc.score >= 85 AND sc.score <100 THEN sc.sid END)/(SELECT COUNT(*) FROM student s)*100, 2) AS '[100-85]百分比',
COUNT(CASE WHEN sc.score >= 70 AND sc.score < 85 THEN sc.sid END) AS '[85-70]',
ROUND(COUNT(CASE WHEN sc.score >= 70 AND sc.score <85 THEN sc.sid END)/(SELECT COUNT(*) FROM student s)*100, 2) AS '[85-70]百分比',
COUNT(CASE WHEN sc.score >= 60 AND sc.score < 70 THEN sc.sid END) AS '[70-60]',
ROUND(COUNT(CASE WHEN sc.score >= 60 AND sc.score <70 THEN sc.sid END)/(SELECT COUNT(*) FROM student s)*100, 2) AS '[70-60]百分比',
COUNT(CASE WHEN sc.score >= 0 AND sc.score < 60 THEN sc.sid END) AS '[60-0]',
ROUND(COUNT(CASE WHEN sc.score >= 0 AND sc.score < 60 THEN sc.sid END)/(SELECT COUNT(*) FROM student s)*100, 2) AS '[60-0]百分比'
FROM score sc
INNER JOIN course c ON c.id = sc.cid
GROUP BY sc.cid,c.name;

-- 18. 查询各科成绩前三名的记录
SELECT sc.sid,sc.cid,sc.score,sc2.score
FROM score sc
INNER JOIN score sc2 ON sc2.cid = sc.cid AND sc2.score > sc.score 
GROUP BY sc.sid,sc.cid,sc.score
HAVING COUNT(sc2.sid) <= 3
ORDER BY sc.cid,sc.score desc;
/* score sc2 會取出最高值 */

-- 19. 查询每门课程被选修的学生数 
SELECT c.name,COUNT(sc.cid)
FROM course c
INNER JOIN score sc ON sc.cid = c.id
GROUP BY c.name;

-- 21. 查询男生、女生人数
SELECT sex,COUNT(sex)
FROM student 
GROUP BY sex;

-- 22. 查询名字中含有「风」字的学生信息
SELECT name
FROM student 
WHERE name like '%风%';

-- 23. 查询同名同性学生名单，并统计同名人数
SELECT s1.*,s2.amount 
FROM student s1
LEFT JOIN (SELECT name,sex,COUNT(*)AS amount FROM student GROUP BY name,sex)s2
ON s1.name = s2.name AND s1.sex = s2.sex
WHERE s2.amount  > 1;

-- 24. 查询 1990 年出生的学生名单
SELECT *
FROM student 
WHERE  YEAR(birth) = 1990;

-- 25. 查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列
SELECT c.id,AVG(sc.score) 
FROM course c
LEFT JOIN score sc ON sc.cid = c.id
GROUP BY c.id
ORDER BY AVG(sc.score),c.id;

-- 26. 查询平均成绩大于等于 85 的所有学生的学号、姓名和平均成绩 
SELECT s.id,s.name,AVG(sc.score)
FROM student s
INNER JOIN score sc ON sc.sid = s.id
GROUP BY s.id
HAVING AVG(sc.score) >= 85; 

-- 27. 查询课程名称为「数学」，且分数低于 60 的学生姓名和分数 
SELECT c.name,s.name,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
WHERE c.name =  '数学' AND sc.score < 60;


-- 28. 查询所有学生的课程及分数情况（存在学生没成绩，没选课的情况）
SELECT s.*,sc.score
FROM student s
LEFT JOIN score sc ON s.id = sc.sid 

-- 29. 查询任何一门课程成绩在 70 分以上的姓名、课程名称和分数
SELECT s.name,c.name,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
WHERE sc.score > 70;

-- 30. 查询不及格的课程
SELECT s.name,c.name,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
WHERE sc.score < 60;

-- 31. 查询课程编号为 01 且课程成绩在 80 分以上的学生的学号和姓名
SELECT s.id,s.name,sc.cid,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
WHERE sc.cid = 1 AND sc.score >= 80;

-- 32. 求每门课程的学生人数 
SELECT c.id,COUNT(c.id)
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
GROUP BY c.id;

-- 33. 成绩不重复，查询选修「张三」老师所授课程的学生中，成绩最高的学生信息及其成绩
SELECT 	s.*,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
LEFT JOIN teacher t ON t.id = c.tid
WHERE t.name = '张三'
ORDER BY sc.score DESC
LIMIT 1;

-- 34. 成绩有重复的情况下，查询选修「张三」老师所授课程的学生中，成绩最高的学生信息及其成绩
SELECT 	s.*,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
LEFT JOIN teacher t ON t.id = c.tid
WHERE t.name = '张三' AND sc.score = 
(SELECT MAX(score) FROM score WHERE cid = c.id);

-- 35. 查询不同课程成绩相同的学生的学生编号、课程编号、学生成绩
SELECT s.id,c.id,sc.score
FROM score sc
LEFT JOIN course c ON  sc.cid = c.id
LEFT JOIN student s ON s.id = sc.sid
LEFT JOIN score sc2 ON sc2.score = sc.score
WHERE sc.cid <> sc2.cid;

-- 36. 查询每门功成绩最好的前两名
SELECT *
FROM (SELECT s.name,sc.sid,sc.cid,ROW_NUMBER() OVER(PARTITION BY cid ORDER BY score DESC)  rn
				FROM score sc JOIN student s ON sc.sid = s.id)B
WHERE rn < 3;

-- 37. 统计每门课程的学生选修人数（超过 5 人的课程才统计）
SELECT c.name,COUNT(c.id)
FROM score sc
LEFT JOIN student s ON s.id = sc.sid
LEFT JOIN course c ON  sc.cid = c.id
GROUP BY c.name
HAVING COUNT(c.id) > 6;

-- 38.检索至少选修两门课程的学生学号 
SELECT s.id
FROM score sc
LEFT JOIN student s ON s.id = sc.sid
LEFT JOIN course c ON  sc.cid = c.id
GROUP BY s.id
HAVING COUNT(c.id) >= 2;

-- 39. 查询选修了全部课程的学生信息
SELECT s.id
FROM score sc
LEFT JOIN student s ON s.id = sc.sid
LEFT JOIN course c ON  sc.cid = c.id
GROUP BY s.id
HAVING COUNT(c.id) = (SELECT COUNT(*) FROM course);

-- 40. 查询各学生的年龄，只按年份来算 
SELECT s.name,2019-year(s.birth) as age
FROM student s;

-- 41. 按照出生日期来算，当前月日 < 出生年月的月日则，年龄减一
SELECT s.name,
	(CASE 
		WHEN MONTH(s.birth) < MONTH(CURDATE()) -- 生日小於當前月
			THEN YEAR(CURDATE()) - YEAR(s.birth) - 1
        WHEN MONTH(s.birth) = MONTH(CURDATE()) AND DAYOFMONTH(s.birth) < DAYOFMONTH(CURDATE()) -- 同月不同日
			THEN YEAR(CURDATE()) - YEAR(s.birth) - 1
		ELSE
			YEAR(CURDATE()) - YEAR(s.birth)  -- 同月同日
	END)
FROM student s;


-- 42. 查询本周过生日的学生
SELECT *
FROM student s
WHERE YEARWEEK(s.birth) = YEARWEEK(CURDATE());

-- 43. 查询下周过生日的学生
SELECT *
FROM student s
WHERE YEARWEEK(s.birth) = YEARWEEK(CURDATE()) + 1;

-- 44. 查询本月过生日的学生
SELECT *
FROM student s
WHERE MONTH(s.birth) = MONTH(CURDATE());

-- 45. 查询下月过生日的学生
SELECT *
FROM student s
WHERE MONTH(s.birth) = MONTH(CURDATE()) + 1; 