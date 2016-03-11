create table Image_Master
(imageno number(2) constraint image_pk primary key ,
	imagename varchar2(50) not null,
	image blob);
	
	select * from Image_Master;
create table mydept
(deptno number(2) constraint dept_pk primary key ,
	dname varchar2(20) not null,
	loc varchar2(10));
	
create table myemp 
(empno number(6) constraint emp_pk primary key,
	ename varchar2(30),
	grade char(2),
dob date, deptno number(2) references mydept(deptno));

drop table myemp;
create table myemp1 
(empno number(6) constraint emp_pk1 primary key
 CHECK (empno >2999),
	ename varchar2(30),
	grade char(2),
dob date, deptno number(2) references mydept(deptno));

create table myemp2 
(empno number(6) constraint emp_pk2 primary key,
	ename varchar2(30),
	grade char(2),
dob date, deptno number(2) references mydept(deptno),
CHECK (empno > 2999 OR dob >= '01-jan-1988'));

create table myemp3 
(empno number(6) constraint emp_pk3 primary key,
	ename varchar2(30) NOT NULL,
	grade char(2),
	email varchar2(30) constraint u_em_email UNIQUE,
dob date, deptno number(2) references mydept(deptno),
CHECK (empno > 2999 OR dob >= '01-jan-1988'));

CREATE TABLE employee_copy AS
SELECT * FROM EMP;

SELECT * FROM employee_copy;

insert into MYDEPT values(10,'HR','Mumbai');
insert into MYDEPT values(20,'IT','Delhi');

insert into MYEMP values(101,'smita','T1','11-Dec-1999',
10);
insert into MYEMP values(102,'Amit','T2','12-Jan-1999',
20);
drop table myemp;
drop table mydept;
select * from myemp;
select ename,grade,deptno from myemp;

select empno,ename,grade,deptno from myemp 
where empno=101;

select empno,ename,grade,deptno from myemp 
where dob='11-Dec-1999';

select empno,ename,grade,deptno from myemp 
where ename like('A%');

select empno,ename,grade,deptno from myemp 
where ename like('_m%');

select empno,ename,deptno 
from emp 
order by ename DESC;

SELECT * FROM MYEMP;

INSERT INTO myemp(EMPNO,ENAME,DEPTNO)
VALUES(104,'Sia',10);

create SEQUENCE SQ_MYEMP
START WITH 1001
INCREMENT BY 1;

insert into MYEMP values(SQ_MYEMP.NEXTVAL,'rita','T1','11-Dec-1999',
10);
insert into MYEMP values(SQ_MYEMP.NEXTVAL,'gita','T1','11-Dec-1999',
10);

SELECT * FROM MYEMP WHERE ENAME='rita';
SELECT * FROM MYEMP WHERE ENAME='gita';
select SQ_MYEMP.CURRVAL from dual;

UPDATE MYEMP
SET GRADE='T2'
WHERE ENAME='smita';

UPDATE MYEMP
SET dob='11-Jan-2001'
WHERE ENAME='smita';

select grade,dob,ename from MYEMP
where ename='smita';

delete from MYEMP
where ename='gita';

select ename from myemp;

RENAME MYEMP TO NEWEMP;
SELECT * FROM MYEMP;
SELECT * FROM NEWEMP;
RENAME NEWEMP TO MYEMP;
SELECT * FROM MYEMP;

ALTER TABLE MYEMP ADD(EMAIL VARCHAR2(50));

ALTER TABLE MYEMP RENAME COLUMN EMAIL TO E_MAIL;

ALTER TABLE MYEMP MODIFY(E_MAIL VARCHAR2(60));

ALTER TABLE MYEMP DROP COLUMN E_MAIL;

ALTER TABLE MYEMP 
ADD CONSTRAINT MYEMP_ename_uniq UNIQUE(ENAME);

ALTER TABLE MYEMP 
DROP CONSTRAINT MYEMP_ename_uniq;















