create table role(
	roleId number(6) constraint role_pk2 primary key,
	roleName varchar2(50) not null,
	roleDesc varchar2(100)
);

create table department(
	deptId number(2) constraint dept_pk2 primary key,
	deptName varchar2(50) not null,
	deptDesc varchar2(100)
);

create table project(
projectId number(2) constraint proj_pk2 primary key,
projectName varchar(50) ,
projectDesc varchar(100),
departmentId integer ,
foreign key(departmentId) references ems.department(departmentId));