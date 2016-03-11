DROP TABLE ROLE;
create table role(
	roleId number(6) constraint role_pk2 primary key,
	roleName varchar2(50) not null,
	roleDesc varchar2(100)
);
create SEQUENCE SQ_ROLE
 START WITH     1001
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
insert into ROLE
values(SQ_ROLE.NEXTVAL,'Manager','Project Head');
insert into ROLE
values(SQ_ROLE.NEXTVAL,'Assisstant Manager','Project Lead');
insert into ROLE
values(SQ_ROLE.NEXTVAL,'Developer','Project Implementation');
insert into ROLE
values(SQ_ROLE.NEXTVAL,'Trainer','Project Assisstance');
SELECT * FROM ROLE;

 DROP TABLE DEPARTMENT;
create table DEPARTMENT(
	deptId number(4) constraint dept_pk2 primary key,
	deptName varchar2(50) not null,
	deptDesc varchar2(100)
);
DROP SEQUENCE SQ_DEPT;
create SEQUENCE SQ_DEPT
 START WITH     10
 INCREMENT BY   10
 NOCACHE
 NOCYCLE;
 
insert into DEPARTMENT
	values(SQ_DEPT.NEXTVAL,'HR','Human Resource');
insert into DEPARTMENT
	values(SQ_DEPT.NEXTVAL,'IT','Information Technology');
insert into DEPARTMENT
	values(SQ_DEPT.NEXTVAL,'Finance','Finance and Accounting');
insert into DEPARTMENT
	values(SQ_DEPT.NEXTVAL,'Training','Technical and Communication');
SELECT * FROM DEPARTMENT;
	
DROP TABLE PROJECT;
create table PROJECT(
	projectId number(6) constraint proj_pk2 primary key,
	projectName varchar2(50) not null,
	projectDesc varchar2(100),
	deptId number(4) ,
	foreign key(deptId) references department(deptId)
);
DROP SEQUENCE SQ_PROJECT;
create SEQUENCE SQ_PROJECT
 START WITH     100
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
insert into PROJECT
	values(SQ_PROJECT.NEXTVAL,'EMS','Employee Management System',10);
insert into PROJECT
	values(SQ_PROJECT.NEXTVAL,'ATM','Banking Project',20);
insert into PROJECT
	values(SQ_PROJECT.NEXTVAL,'HMS','Hospital Management System',30);
insert into PROJECT
	values(SQ_PROJECT.NEXTVAL,'Tally','Employee Management System',40);
select * from PROJECT;
DROP TABLE employee;
create table employee(
	employeeId number(6) constraint employee_pk2 PRIMARY KEY,
	employeeName varchar2(50)NOT NULL,
	kinId varchar2(20) UNIQUE NOT NULL,
	emailId varchar2(20) UNIQUE NOT NULL,
	phoneNo VARCHAR2(12) not null ,
	dob date not null,
	doj date not null,
	address varchar2(200) not null,
	deptId number(4),
	projectId number(6),
	roleId number(6),
	FOREIGN KEY(deptId) REFERENCES department(deptId),
	FOREIGN KEY(projectId) REFERENCES project(projectId),
	FOREIGN KEY(roleId) REFERENCES role(roleId),
	CHECK (dob >= '01-jan-1988')
);
DROP SEQUENCE SQ_EMPLOYEE;
create SEQUENCE SQ_EMPLOYEE
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 insert into employee
values(SQ_EMPLOYEE.NEXTVAL,'SMITA','kin11','sea@gmail.com'
,'23456778','11-Dec-1988','12-Dec-2015','Old fort Delhi',10,101,1001);
insert into employee
values(SQ_EMPLOYEE.NEXTVAL,'Bishakha','kin12','bish@gmail.com','78956778'
,'12-Dec-1989','12-Nov-2015','Red fort Delhi',20,102,1002);

insert into employee
values(SQ_EMPLOYEE.NEXTVAL,'Pooja','kin13','pooja@gmail.com','989856778'
,'13-Dec-1989','12-Feb-2015','Deccan Pune',30,103,1003);

insert into employee
values(SQ_EMPLOYEE.NEXTVAL,'Preet','kin14','preet@gmail.com','787856778'
,'13-Jan-1989','12-Mar-2015','Vashi Navi Mumbai',40,104,1004);

