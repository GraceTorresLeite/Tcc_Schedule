 create table schedule(
 
 	id bigint not null auto_increment,
 	client_id bigint not null,
 	service_type_id bigint not null,
 	total decimal(10,2) not null,
 	status_schedule varchar(20) not null,
 	date_schedule datetime not null,
 
 	primary key (id)
 );
 alter table schedule add constraint fk_schedule_client foreign key (client_id) references client(id);
 alter table schedule add constraint fk_schedule_service_type foreign key (service_type_id) references service_type(id);