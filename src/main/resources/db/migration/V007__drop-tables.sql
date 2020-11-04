DROP TABLE  IF EXISTS  address;
DROP TABLE  IF EXISTS  client;
DROP TABLE  IF EXISTS  service_type;
DROP TABLE  IF EXISTS  schedule;

create table address
(
   id bigint not null auto_increment,
   name varchar (60) not null,
   number varchar (10) not null,
   complement varchar (100),
   neighborhood varchar (70),
   city varchar(50) not null,
   primary key (id)
);

create table client
(
   id bigint not null auto_increment,
   name varchar (60) not null,
   email varchar (255) not null,
   phone varchar (11) not null,
   address_id integer not null,
   primary key (id),
   foreign key (address_id) references address(id)
);

create table service_type(
 
 	id bigint not null auto_increment,
 	description varchar(200) not null,
 	total decimal(10,2) not null,
 	duration integer ,
 
	 primary key (id)
 );
 
 create table schedule(
 
 	id bigint not null auto_increment,
 	client_id bigint not null,
 	service_type_id bigint not null,
 	total decimal(10,2) not null,
 	status_schedule varchar(20) not null,
 	date_schedule datetime not null,
 
 	primary key (id),
 	foreign key (client_id) references client(id),
 	foreign key (service_type_id) references service_type(id)
 );
