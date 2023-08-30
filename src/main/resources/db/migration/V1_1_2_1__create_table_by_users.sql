create table IF NOT EXISTS users(
 	id serial primary key,
  	username varchar(50),
  	password varchar(250),
  	stateid int4 NOT NULL,
  	businesssubjectid int4 NOT NULL,
  	constraint category_id_fk foreign key (businesssubjectid) references businesssubject(id),
  	constraint state_id_fk foreign key (stateid) references state(id)
);


INSERT INTO users(id,username,password,stateid,businesssubjectid)
       VALUES (1,'admin','f105652061ab1f1ec400e8fedc2e5f01e55b8af7763ce47bea0fab8b51b1d284',1,1);

