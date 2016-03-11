create table test.Image_Master
(imageno integer primary key,
	imagename varchar(50) not null,
	image blob(1000000));
	select * from test.Image_Master;
	
	create table test.emp
	(empid integer primary key,
	empname varchar(20) not null,
	empsal double
	);
create database cg;
create database ems;
use ems;

create table ems.department
(
	deptid int AUTO_INCREMENT PRIMARY KEY,
	deptname varchar(50),
	deptdesc varchar(100)
);
alter table ems.department AUTO_INCREMENT=11;
INSERT INTO EMS.DEPARTMENT(DEPTNAME,DEPTDESC)
VALUES('HR','HUMAN RESOURCE');
INSERT INTO EMS.DEPARTMENT(DEPTNAME,DEPTDESC)
VALUES('IT','iNFORMATION TECHNOLOGY');
INSERT INTO EMS.DEPARTMENT(DEPTNAME,DEPTDESC)
VALUES('FINANCE','FINANCE AND ACCOUNTING');
INSERT INTO EMS.DEPARTMENT(DEPTNAME,DEPTDESC)
VALUES('TRAINING','TRAINING AND CONSULTING');

select * from ems.department;

create table ems.project
(projectid int AUTO_INCREMENT PRIMARY KEY,
prjectname varchar(50),
projectdesc varchar(100),
deptid int,
FOREIGN KEY (deptid) REFERENCES ems.department(deptid)
);
alter table ems.project AUTO_INCREMENT=101;
INSERT INTO EMS.project(prjectname,projectdesc,deptid)
VALUES('EMS','Employee Management System',12);
INSERT INTO EMS.project(prjectname,projectdesc,deptid)
VALUES('ATM','Banking Project',12);
INSERT INTO EMS.project(prjectname,projectdesc,deptid)
VALUES('EMS','Employee Management System',11);
INSERT INTO EMS.project(prjectname,projectdesc,deptid)
VALUES('Tally','Account System',13);

creat table ems.employee
(
	empid int AUTO_INCREMENT PRIMARY KEY,
	empname varchar(50) NOT NULL,
	kinid varchar(20) UNIQUE NOT NULL,
	emailid varchar(50) UNIQUE NOT NULL,
	phoneno varchar(12) UNIQUE NOT NULL,
	dob DATE NOT NULL,
	doJ DATE NOT NULL,
	address varchar(200) NOT NULL,
	deptid int,
	projectid int,
	roleid int,
	FOREIGN KEY(deptid) REFERENCES ems.department(deptid),
	FOREIGN KEY(projectid) REFERENCES ems.project(projectid),
	FOREIGN KEY(roleid) REFERENCES ems.role(roleid)
);
alter table ems.employee AUTO_INCREMENT=1001;
