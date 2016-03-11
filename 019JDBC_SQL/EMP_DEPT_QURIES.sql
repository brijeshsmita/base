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





















