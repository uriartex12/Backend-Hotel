CREATE TABLE IF NOT EXISTS subject(
    	id serial primary key,
    	identitydocumentid int4 NOT NULL,
    	identitynumber varchar(20),
    	firstname varchar(255),
    	secondname varchar(255),
    	birthday timestamp,
    	address text,
    	phone varchar(50),
        subjecttypeid int4,
        districtid int4,
        maritalstatus varchar(50),
    	constraint identitydocument_id_fk foreign key (identitydocumentid) references identitydocument(id),
    	constraint subjecttype_id_fk foreign key (subjecttypeid) references subjecttype(id)
);


INSERT INTO subject(id,identitydocumentid,identityNumber,firstname,secondname,birthday,address,phone,subjecttypeid,districtid,maritalstatus)
                   VALUES (1,1,'73170086','anonimos','','12-02-2023','Jr. Grau 578','+51 945224785',2,null,'Soltero(a)');