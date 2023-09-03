create table IF NOT EXISTS category(
 	id serial primary key,
  	name varchar(250),
  	description varchar(250)
);


create table IF NOT EXISTS habitation(
 	id serial primary key,
  	name varchar(250),
  	nbets int4 NOT NULL,
  	categoryid int4 NOT NULL,
  	description varchar(250),
  	stateid int4,
  	constraint category_id_fk foreign key (categoryid) references category(id),
  	constraint state_id_fk foreign key (stateid) references state(id)
);
