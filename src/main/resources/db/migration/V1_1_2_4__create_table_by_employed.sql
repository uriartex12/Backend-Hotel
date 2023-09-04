CREATE TABLE IF NOT EXISTS employed(
    	id serial primary key,
    	businesssubjectid int4 NOT NULL,
    	subsidiaryid int4 NULL,
     	subjectrolid int4 NOT NULL,
        warehouseid int4 NULL,
    	constraint businesssubject_id_fk foreign key (businesssubjectid) references businesssubject(id),
    	constraint subjectrol_id_fk foreign key (subjectrolid) references subjectrol(id)
)