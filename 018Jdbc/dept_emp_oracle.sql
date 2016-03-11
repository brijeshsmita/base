create table mydept
(deptno number(2) constraint dept_pk primary key ,
	dname varchar2(20) not null,
	loc varchar2(10));
insert into mydept values(10,'java','mumbai');
insert into mydept values(30,'c#','pune');
insert into mydept values(40,'SAP','pune');
select * from MYDEPT;
drop table myemp;
create table myemp 
(
	empno number(6) constraint emp_pk primary key,
	ename varchar2(30),
	grade char(2),
	dob date,
	deptno number(2) constraint dept_fk references mydept(deptno)
	ON DELETE CASCADE
);
insert into mydept values(20,'oracle','mumbai');
SELECT * FROM MYEMP WHERE DEPTNO=20;
SELECT ENAME,DEPTNO FROM MYEMP WHERE DEPTNO=10;

insert into MYEMP values(1111,'smita','T1','11-Dec-1999',10);
insert into MYEMP values(2222,'Amit','T2','12-Jan-1999',20);
insert into MYEMP values(3333,'Amita','T2','12-Jan-1999',20);
insert into MYEMP values(5555,'Amita','T2','12-Jan-1999',20);
insert into MYEMP values(4444,'Mita','T2','15-Feb-2001',40);
select * from myemp;

drop table myemp;
DELETE FROM MYDEPT WHERE deptno=20;

SELECT LOC,DEPTNO FROM MYDEPT WHERE DEPTNO=10;
UPDATE MYDEPT set LOC='LONDON' WHERE DEPTNO=10;
SELECT LOC,DEPTNO FROM MYDEPT WHERE DEPTNO=10;

DESC MYEMP;

SELECT DISTINCT DEPTNO FROM MYEMP;

select * from myemp order by ename;

select * from myemp order by empno desc;

SELECT * FROM myemp WHERE dob <= '12-Jan-1999';

SELECT * FROM myemp WHERE dob >= '11-Dec-1999'  AND  dob <= '12-Jan-1999';
SELECT * FROM myemp WHERE dob >= '11-Dec-1999'  OR  dob <= '12-Jan-1999';

SELECT *  FROM myemp WHERE dob BETWEEN '12-Jan-1999' AND '11-Dec-1999';

SELECT ename,deptno  FROM myemp WHERE deptno IN(10,20,50);

SELECT empno, ename FROM myemp WHERE ename LIKE 's%';
SELECT empno, ename FROM myemp WHERE ename LIKE '_i%';
SELECT empno, ename FROM myemp WHERE ename LIKE '__i%';

insert into myemp (empno, ename)values(6666,'Sita');
insert into myemp (empno, ename)values(7777,'Rita');

select * from myemp WHERE deptno IS NULL;

SELECT empno+NVL(DEPTNO,0) FROM myemp;

SELECT ROUND(52.4) FROM dual;
SELECT CEIL(23.2) FROM dual;
SELECT TRUNC(52.6576474,2) FROM dual;
SELECT ABS(-10) FROM dual; 
SELECT FLOOR(56.99) FROM dual; 
SELECT POWER(3,2) FROM dual;
SELECT MOD(5,2) FROM dual; 
SELECT SQRT(4) FROM dual; 


SELECT CONCAT (ename,dob) FROM myemp;
SELECT UPPER(ename), LOWER(ename),INITCAP(ename)  FROM myemp;
SELECT TRIM(ename) FROM myemp;
SELECT LTRIM(ename), RTRIM(ename) FROM myemp;
SELECT LENGTH (ename) FROM myemp;
SELECT INSTR(ename, 's',1) FROM myemp;
SELECT SUBSTR(ename,1,3) FROM myemp;


SELECT TO_CHAR(dob, 'DD-MON-YY') FROM myemp;
SELECT ADD_MONTHS(dob,11) FROM myemp;
SELECT floor(MONTHS_BETWEEN(sysdate,dob)) FROM myemp;


SELECT TO_CHAR(1981) FROM dual;
SELECT TO_NUMBER('1221') FROM dual;
SELECT TO_DATE('12-FEB-2007') FROM dual;

SELECT MIN(dob) "Senior Most Employee" FROM myemp;
SELECT MAX(deptno) "maximum" FROM myemp ;
SELECT AVG(deptno) "Average" FROM myemp ;

SELECT count(*) "Total_EMployee_row" FROM myemp;
SELECT count(ename) "Total_EMployee_row" FROM myemp;














