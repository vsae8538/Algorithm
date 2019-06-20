Create table If Not Exists seat(id int, student varchar(255))
Truncate table seat
insert into seat (id, student) values ('1', 'Abbot');
insert into seat (id, student) values ('2', 'Doris');
insert into seat (id, student) values ('3', 'Emerson');
insert into seat (id, student) values ('4', 'Green');
insert into seat (id, student) values ('5', 'Jeames');
SELECT * FROM seat;

SELECT 
(CASE 
	WHEN MOD(id,2) != 0 AND counts != id THEN id + 1
	WHEN MOD(id,2) != 0 AND counts = id THEN id
    ELSE id - 1
END) AS id,
student 
FROM seat,(SELECT COUNT(*) AS counts FROM seat) AS seat_counts
ORDER BY id ASC;