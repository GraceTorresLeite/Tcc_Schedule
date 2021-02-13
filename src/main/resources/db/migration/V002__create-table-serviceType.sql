 create table service_type(
 
 	id bigint not null auto_increment,
 	description varchar(200) not null,
 	total decimal(10,2) not null,
 	duration time ,
 
	 primary key (id)
 );