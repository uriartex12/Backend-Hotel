create table IF NOT EXISTS users(
 	id serial primary key,
  	name varchar(250),
  	lastname varchar(250),
  	identitynumber varchar(250),
  	username varchar(50),
  	password varchar(250)
);
