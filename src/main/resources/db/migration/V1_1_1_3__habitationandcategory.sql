create table IF NOT EXISTS category(
 	id serial primary key,
  	name varchar(250),
  	description varchar(250)
);


create table IF NOT EXISTS habitation(
 	id serial primary key,
  	name varchar(250),
  	categoryId int4 NOT NULL,
  	description varchar(250),
  	status int4,
  	constraint category_id_fk foreign key (categoryId) references category(id)
);