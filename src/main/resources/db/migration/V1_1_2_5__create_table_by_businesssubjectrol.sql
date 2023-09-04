CREATE TABLE IF NOT EXISTS businesssubjectrol(
    	id serial primary key,
    	businesssubjectid int4 NOT NULL,
     	subjectrolid int4 NOT NULL,
        startdate timestamp,
        enddate timestamp,
    	constraint businesssubject_id_fk foreign key (businesssubjectid) references businesssubject(id),
    	constraint subjectrol_id_fk foreign key (subjectrolid) references subjectrol(id)
)