drop table ems.employee;
drop table ems.role;
drop table ems.department;
drop table ems.project;
create database ems;
drop database ems;
use ems;


create table ems.department(
departmentId integer AUTO_INCREMENT ,
departmentName varchar(50) not null,
deptDesc varchar(100),
primary key(departmentId));



ALTER TABLE ems.department AUTO_INCREMENT=1001;

insert into ems.department(departmentName,deptDesc)
values('HR','Human Resource');
insert into ems.department(departmentName,deptDesc)
values('IT','Information Technology');
insert into ems.department(departmentName,deptDesc)
values('Finance','Finance and Accounting');
insert into ems.department(departmentName,deptDesc)
values('Training','Technical and Communication');


select * from ems.department;




create table ems.role(
roleId integer AUTO_INCREMENT,
roleName varchar(50) not null,
roleDesc varchar(100),
primary key(roleId));


ALTER TABLE ems.role AUTO_INCREMENT=101;


insert into ems.role(roleName,roleDesc)
values('Manager','Project Head');
insert into ems.role(roleName,roleDesc)
values('Assisstant Manager','Project Lead');
insert into ems.role(roleName,roleDesc)
values('Developer','Project Implementation');
insert into ems.role(roleName,roleDesc)
values('Trainer','Project Assisstance');

select * from ems.role;


create table ems.project(
projectId integer AUTO_INCREMENT PRIMARY KEY,
projectName varchar(50) ,
projectDesc varchar(100),
departmentId integer ,
foreign key(departmentId) references ems.department(departmentId));

ALTER TABLE ems.project AUTO_INCREMENT=11;

insert into ems.project(projectName,projectDesc,departmentId)
values('EMS','Employee Management System',1001);
insert into ems.project(projectName,projectDesc,departmentId)
values('ATM','Banking Project',1002);
insert into ems.project(projectName,projectDesc,departmentId)
values('EMS','Employee Management System',1001);
insert into ems.project(projectName,projectDesc,departmentId)
values('Tally','Employee Management System',1003);

select * from ems.project;

create table ems.employee(
	employeeId int AUTO_INCREMENT PRIMARY KEY,
	employeeName varchar(50)NOT NULL,
	kinId varchar(20) UNIQUE KEY NOT NULL,
	emailId varchar(20) UNIQUE KEY NOT NULL,
	phoneNo VARCHAR(12) not null ,
	dateOfBirth date not null,
	dateOfJoining date not null,
	address varchar(200) not null,
	departmentId int,
	projectId int,
	roleId int,
	FOREIGN KEY(departmentId) REFERENCES ems.department(departmentId),
	FOREIGN KEY(projectId) REFERENCES ems.project(projectId),
	FOREIGN KEY(roleId) REFERENCES ems.role(roleId)
);

ALTER TABLE ems.employee AUTO_INCREMENT=4001;

insert into ems.employee(employeeName,kinid,emailId,phoneNo,dateOfBirth,dateOfJoining,address,departmentId,projectId,roleId)
values('Sourab','KinID11','sea@gmail.com','23456778','1989/11/20','2014/5/24','Old fort Delhi',1001,11,101);

insert into ems.employee(employeeName,kinid,emailId,phoneNo,dateOfBirth,dateOfJoining,address,departmentId,projectId,roleId)
values('Bishakha','kin12','bish@gmail.com','78956778','1989/11/20','2014/5/24','Old fort Delhi',1002,12,102);

insert into ems.employee(employeeName,kinid,emailId,phoneNo,dateOfBirth,dateOfJoining,address,departmentId,projectId,roleId)
values('Pooja','kin13','pooja@gmail.com','989856778','1989/11/20','2014/5/24','Old  Delhi',1002,13,102);

insert into ems.employee(employeeName,kinid,emailId,phoneNo,dateOfBirth,dateOfJoining,address,departmentId,projectId,roleId)
values('Preet','kin14','preet@gmail.com','787856778','1989/11/20','2014/5/24','New Delhi',1001,11,103);

select * from ems.employee ;
