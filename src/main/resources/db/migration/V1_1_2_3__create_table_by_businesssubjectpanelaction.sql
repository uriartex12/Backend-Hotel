create table IF NOT EXISTS businesssubjectpanelaction(
 	id serial primary key,
  	businesssubjectid int4,
  	panelactionid int4,
  	subjectrolid int4 ,
  	date timestamp,
  	state int4,
  	constraint category_id_fk foreign key (businesssubjectid) references businesssubject(id),
  	constraint panelaction_id_fk foreign key (panelactionid) references panelaction(id),
  	constraint subjectrol_id_fk foreign key (subjectrolid) references subjectrol(id)
);

