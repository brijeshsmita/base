drop table test.Image_Master;
create table test.Image_Master
(imageno integer primary key ,
	imagename varchar(50) not null,
	image blob(100000000));

create table Image_Master
(imageno number(2) constraint image_pk primary key ,
	imagename varchar2(50) not null,
	image blob);
	
	select * from Image_Master;
create table mydept
(deptno number(2) constraint dept_pk primary key ,
	dname varchar2(20) not null,
	loc varchar2(10));
	
create SEQUENCE SQ_DEPT	
START WITH 10
INCREMENT BY 10;

insert into MYDEPT values(SQ_DEPT.NEXTVAL,'HR','Mumbai');

create SEQUENCE SQ_MYEMP
START WITH 1001
INCREMENT BY 1;	

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
drop table emp;
create table emp 
(
	empno number(6) constraint emp_pk3 primary key,
	ename varchar2(30) NOT NULL,
	grade char(2),
	salary number(6,2),
	email varchar2(30) constraint u_em_email UNIQUE,
	dob date, 
	doj date, 
	address varchar2(30),
	deptno number(2) constraint dept_fk3 references mydept(deptno),
	CHECK (empno > 2999 OR dob >= '01-jan-1988')
);


	
 1) create sequence in database by using the following query.
CREATE SEQUENCE sequence_name
[START WITH start_num]
[INCREMENT BY increment_num]
[ { MAXVALUE maximum_num | NOMAXVALUE } ]
[ { MINVALUE minimum_num | NOMINVALUE } ]
[ { CYCLE | NOCYCLE } ]
[ { CACHE cache_num | NOCACHE } ]
[ { ORDER | NOORDER } ];
example:

create SEQUENCE SQ_EMP
 START WITH     3001
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
insert into emp values(SQ_EMP.NEXTVAL,'rita','T1',9999.99,
'rita@g.com','11-Dec-1999','12-Dec-2015','Mumbai',10);

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















