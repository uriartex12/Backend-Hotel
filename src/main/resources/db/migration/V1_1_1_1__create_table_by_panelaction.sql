create table IF NOT EXISTS panelaction(
 	id serial primary key,
  	submenu varchar(250),
  	state int4,
  	menu varchar(250),
  	page varchar(250),
  	mask varchar(250),
  	icon varchar(50)
);
