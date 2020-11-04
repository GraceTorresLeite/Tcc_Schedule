DROP TABLE  IF EXISTS  client;
DROP TABLE  IF EXISTS  address;
DROP TABLE  IF EXISTS  schedule;
DROP TABLE  IF EXISTS  service_type;


create table client( 
 
   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   first_name varchar (30) not null,
   last_name varchar (30) not null,
   email varchar (255) not null,
   phone varchar (11) not null
  
);

create table address
(
   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   client_id int (4) not null,
   name varchar (60) not null,
   number varchar (10) not null,
   complement varchar (100),
   neighborhood varchar (70),
   city varchar(50) not null,
   
   constraint fk_address_client foreign key (client_id) references client(id)
   
);

create table schedule(
 
 	id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 	client_id INT(4) UNSIGNED NOT NULL,
 	schedule_date timestamp not null,
 	status_schedule varchar(20) not null,
 	description VARCHAR(255),
 
 	FOREIGN KEY (client_id) REFERENCES client(id)
 );

create table service_type(
 
 	id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 	description varchar(200) not null,
 	price decimal(10,2) not null,
 	duration integer 
 	schedule_id int (4) unsigned not null,
 	
 	foreign key (schedule_id) references schedule(id)
 
 );
 
 
 
 
