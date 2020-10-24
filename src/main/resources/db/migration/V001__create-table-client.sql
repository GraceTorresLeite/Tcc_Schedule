create table client
(
   id bigint not null auto_increment,
   name varchar (60) not null,
   email varchar (255) not null,
   phone varchar (9) not null,
   address_id varchar (70),
   primary key (id)
);