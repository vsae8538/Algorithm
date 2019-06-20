
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

-- 1.查询" 01 "课程比" 02 "课程成绩高的学生的信息及课程分数
SELECT s.*, sc1.score AS '01-score', sc2.score AS '02-score'
FROM student s
JOIN score sc1 ON s.id = sc1.sid AND sc1.cid = 1 
JOIN score sc2 ON s.id = sc2.sid AND sc2.cid = 2
WHERE sc1.score > sc2.score;

-- 1.1 查询同时存在" 01 "课程和" 02 "课程的情况
SELECT s.name,c1.name AS '01-course' , c2.name AS '02-course'
FROM student s 
JOIN score sc ON sc.sid = s.id
JOIN (SELECT * FROM course WHERE id = 1) c1  
JOIN (SELECT * FROM course WHERE id = 2) c2 
WHERE sc.cid = c1.id 

-- 1.2 查询存在" 01"课程但可能不存在" 02 "课程的情况(不存在时显示为 null )
SELECT * FROM (SELECT * FROM score WHERE cid = 1) AS a 
LEFT JOIN (SELECT * FROM score WHERE cid = 2) AS b ON a.sid = b.sid
WHERE  a.sid NOT IN (SELECT sid FROM  score where cid = 2)

-- 1.3 查询不存在" 01 "课程但存在" 02 "课程的情况
SELECT sc.sid, sc.cid, sc.score 
FROM (SELECT * FROM score WHERE cid = 2) AS sc
LEFT JOIN score sc2 ON sc2.cid = 1 AND sc.sid = sc2.sid 
WHERE sc.sid NOT IN(SELECT sid FROM score where cid = 1)

-- 2. 查询平均成绩大于等于 60 分的同学的学生编号和学生姓名和平均成绩
SELECT s.id AS number, s.name, AVG(score)
FROM student s
JOIN score sc ON s.id = sc.sid 
WHERE sc.score >= 60 
GROUP BY s.id

-- 3. 查询在 SC 表存在成绩的学生信息
SELECT * 
FROM student 
WHERE id IN(SELECT DISTINCT sid FROM score);

-- 4. 查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩(没成绩的显示为 null ) 提示;count(),sum()
SELECT s.id AS 'no.', s.name, count(cid), sum(score)
FROM score sc 
JOIN student s  
WHERE sc.sid = s.id
GROUP BY s.id

-- 4.1 查有成绩的学生信息
SELECT DISTINCT s.*
FROM student s,score sc
WHERE s.id = sc.sid
AND sc.cid IS NOT null

-- 5. 查询「李」姓老师的数量
SELECT COUNT(*) 
FROM teacher
WHERE name like '李%'

-- 6. 查询学过「张三」老师授课的同学的信息 
SELECT s.*
FROM student s, score sc, course c, teacher t
WHERE s.id = sc.sid
AND sc.cid = c.id
AND c.tid = t.id
AND t.name = '张三'

SELECT s.* -- ,c.*,sc.*,t.*
FROM score sc
JOIN student s ON s.id = sc.sid
JOIN course c ON sc.cid = c.id
JOIN teacher t ON c.tid = t.id
WHERE t.name = '张三'


-- 7. 查询没有学全所有课程的同学的信息 
SELECT s.name,COUNT(sc.cid)
FROM student s,score sc,course c
WHERE s.id = sc.sid
AND sc.cid = c.id
GROUP BY s.name
HAVING COUNT(sc.cid) < 3


-- 8. 查询至少有一门课与学号为" 01 "的同学所学相同的同学的信息 
SELECT * 
FROM student
WHERE id in (SELECT sid FROM score WHERE cid in (SELECT cid FROM score WHERE sid = 1))


-- 9. 查询和" 01 "号的同学学习的课程完全相同的其他同学的信息 
SELECT s.name,COUNT(c.id)
FROM student s,score sc,course c
WHERE s.id = sc.sid AND c.id  in (SELECT COUNT(cid) FROM score WHERE sid = 1) -- = sc.cid  
GROUP BY s.name
HAVING COUNT(c.id) >= 3

-- 10. 查询没学过"张三"老师讲授的任一门课程的学生姓名 
SELECT DISTINCT s.name
FROM student s
JOIN score sc ON s.id = sc.sid
JOIN course c ON sc.cid = c.id 
JOIN teacher t ON c.tid = t.id 
WHERE  s.id NOT IN (
SELECT sc.sid FROM score sc WHERE sc.cid NOT IN
	(SELECT c.id FROM course c WHERE c.tid NOT IN (SELECT id FROM teacher WHERE name = '张三'))
)

-- 11. 查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩 
SELECT s.id, s.name, AVG(sc.score)
FROM student s,score sc
WHERE s.id = sc.sid AND sc.score < 60
GROUP BY s.id,s.name
HAVING COUNT(sc.score) >= 2 

-- 12. 检索" 01 "课程分数小于 60，按分数降序排列的学生信息
SELECT s.*,sc.score
FROM student s,score sc
WHERE s.id = sc.sid AND sc.score < 60 AND sc.cid = 1
ORDER BY sc.score DESC

-- 13. 按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
SELECT s.id, s.name,sc1.score,sc2.score,sc3.score,AVG(sc.score)
FROM score sc
JOIN student s ON sc.sid = s.id
LEFT JOIN score sc1 ON sc1.sid = s.id AND sc1.cid = 1
LEFT JOIN score sc2 ON sc2.sid = s.id AND sc2.cid = 2
LEFT JOIN score sc3 ON sc3.sid = s.id AND sc3.cid = 3
GROUP BY s.id,s.name,sc1.score,sc2.score,sc3.score
ORDER BY AVG(sc.score) DESC

-- 14. 查询各科成绩最高分、最低分和平均分：
-- 以如下形式显示：课程 ID，课程 name，最高分，最低分，平均分，及格率，中等率，优良率，优秀率
--  及格为>=60，中等为：70-80，优良为：80-90，优秀为：>=90
--  要求输出课程号和选修人数，查询结果按人数降序排列，若人数相同，按课程号升序排列
SELECT c.id AS '課程ID', c.name AS '課程',
MAX(sc.score) AS '最高分',
MIN(sc.score) AS '最低分',
AVG(sc.score) AS '平均分',
SUM(CASE WHEN sc.score >= 60 THEN 1 ELSE 0 END)/COUNT(1) AS '及格率',
SUM(CASE WHEN sc.score >= 70 AND sc.score < 80 THEN 1 ELSE 0 END)/COUNT(1) AS '中等率',
SUM(CASE WHEN sc.score >= 80 AND sc.score < 90 THEN 1 ELSE 0 END)/COUNT(1) AS '優良率',
SUM(CASE WHEN sc.score >= 90 THEN 1 ELSE 0 END)/COUNT(1) AS '優秀率',
COUNT(sc.sid) AS '選修人數'
FROM course c,score sc
WHERE sc.cid = c.id
GROUP BY c.id,c.name
ORDER BY COUNT(sc.sid) DESC,c.id

-- 15. 按各科成绩进行排序，并显示排名， Score 重复时保留名次空缺
SELECT *,RANK() OVER(ORDER BY score DESC) AS 排名
FROM score

-- 15.1按各科成绩进行排序，并显示排名， Score 重复时合并名次
SELECT *,DENSE_RANK() OVER(ORDER BY score DESC) AS 排名
FROM score


-- 16.  查询学生的总成绩，并进行排名，总分重复时保留名次空缺
SELECT s.name, SUM(sc.score), RANK() OVER(ORDER BY SUM(sc.score) DESC) AS 排名
FROM student s,score sc
WHERE sc.sid = s.id
GROUP BY s.name
-- 16.1 查询学生的总成绩，并进行排名，总分重复时不保留名次空缺
SELECT s.name, SUM(sc.score), DENSE_RANK() OVER(ORDER BY SUM(sc.score) DESC) AS 排名
FROM student s,score sc
WHERE sc.sid = s.id
GROUP BY s.name

-- 17. 统计各科成绩各分数段人数：课程编号，课程名称，[100-85]，[85-70]，[70-60]，[60-0] 所占百分比
SELECT c.id AS '課程編號',c.name AS '課程名稱',
CONCAT(ROUND(SUM(CASE WHEN sc.score >= 85 THEN 1 ELSE 0 END)/COUNT(1)*100,2),'%') AS '[100-85]',
CONCAT(ROUND(SUM(CASE WHEN sc.score >= 70 AND sc.score < 85 THEN 1 ELSE 0 END)/COUNT(1)*100,2),'%') AS '[85-70]',
CONCAT(ROUND(SUM(CASE WHEN sc.score >= 60 AND sc.score < 70 THEN 1 ELSE 0 END)/COUNT(1)*100,2),'%') AS '[70-60]',
CONCAT(ROUND(SUM(CASE WHEN sc.score < 60 THEN 1 ELSE 0 END)/COUNT(1)*100,2),'%') AS '[60-0]'
FROM course c,score sc
WHERE c.id = sc.cid 
GROUP BY c.id, c.name



-- -- 17 - 1. 统计各科成绩各分数段人数：课程编号，课程名称，[100-85]，[85-70]，[70-60]，[60-0] 所佔人數
SELECT c.id AS '課程編號',c.name AS '課程名稱',
SUM(CASE WHEN sc.score >= 85 THEN 1 ELSE 0 END) AS '[100-85]',
SUM(CASE WHEN sc.score BETWEEN 70 AND  85 THEN 1 ELSE 0 END) AS '[85-70]',
SUM(CASE WHEN sc.score BETWEEN 60 AND  70 THEN 1 ELSE 0 END) AS '[70-60]',
SUM(CASE WHEN sc.score < 60 THEN 1 ELSE 0 END) AS '[60-0]'
FROM course c,score sc
WHERE c.id = sc.cid 
GROUP BY c.id, c.name

-- 18. 查询各科成绩前三名的记录
SELECT * FROM(
SELECT *,RANK() OVER(partition by cid ORDER BY score DESC) AS A
FROM score) AS B
WHERE B.A <= 3
-- 函數別名無法直接使用
--  SELECT * , RANK() OVER(partition by cid ORDER BY score DESC) AS A FROM score WHERE A <= 3

-- 19. 查询每门课程被选修的学生数 
SELECT c.name,COUNT(sc.cid)
FROM course c,score sc
WHERE sc.cid = c.id
GROUP BY c.name

-- 20. 查询出只选修两门课程的学生学号和姓名 
SELECT s.id,s.name,COUNT(s.id)
FROM student s
JOIN score sc ON s.id = sc.sid
GROUP BY s.id,s.name
HAVING COUNT(s.id) <= 2

-- 注意 HAVING要在GROUP BY下面（先分組後篩選資料數）

-- 21. 查询男生、女生人数
SELECT s.sex,COUNT(s.sex)
FROM student s 
GROUP BY s.sex 

-- 22. 查询名字中含有「风」字的学生信息
SELECT name
FROM student 
WHERE name LIKE '%风%'

-- 23. 查询同名同姓学生名单，并统计同名人数
SELECT name,COUNT(1)
FROM student
GROUP BY name 
HAVING COUNT(1) > 1; -- 當超過2,表示同名同姓超過一位

--  24.查询 1990 年出生的学生名单
SELECT *
FROM student 
WHERE birth like '%1990%'

-- 25. 查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列
SELECT c.name,AVG(sc.score)
FROM course c,score sc
WHERE sc.cid = c.id
GROUP BY c.id
ORDER BY AVG(sc.score) DESC,c.id 

-- 26. 查询平均成绩大于等于 85 的所有学生的学号、姓名和平均成绩
SELECT s.id,s.name,AVG(sc.score) AS A
FROM student s,score sc
WHERE s.id = sc.sid
GROUP BY s.id,s.name
HAVING A >= 85

-- 27. 查询课程名称为「数学」，且分数低于 60 的学生姓名和分数 
SELECT s.id,s.name,sc.score
FROM student s,score sc
JOIN course c ON c.id = sc.cid AND c.id = 2
WHERE s.id = sc.sid
AND sc.score < 60

-- 28. 查询所有学生的课程及分数情况（存在学生没成绩，没选课的情况）
SELECT s.id,s.name,c.name,sc.score
FROM student s
LEFT JOIN score sc ON sc.sid = s.id 
LEFT JOIN course c ON c.id = sc.cid
ORDER BY s.id

-- 29. 查询不及格的课程
SELECT s.id,s.name,c.name,sc.score
FROM score sc,course c,student s
WHERE sc.cid = c.id
AND s.id = sc.sid
AND sc.score < 60

-- 30. 查询课程编号为 01 且课程成绩在 80 分以上的学生的学号和姓名
SELECT s.id,s.name,sc.score,c.id
FROM student s
JOIN score sc ON sc.sid = s.id
JOIN course c ON c.id = sc.cid
WHERE c.id = 1
AND sc.score >= 80