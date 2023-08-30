CREATE TABLE IF NOT EXISTS businesssubject(
    	id serial primary key,
    	subjectid int4 NOT NULL,
    	identitydocumentid int4 NOT NULL,
    	identitynumber varchar(20),
    	businessname varchar(255),
        subjectrolcategoryid int4 NOT NULL,
        startdate timestamp,
        phone varchar(50),
        address text,
        districtid int4,
        email varchar(100),
        code varchar(10),
        provinceid int4,
        city varchar(50),
        companyid int4,
        state int4,
        otherreferences varchar(100),
        parentid int4,
        paymodeid int4,
        payrollentrydate timestamp,
        salary numeric(18, 2),
        browser_agent text,
        creditcard varchar(255),
        constraint subject_id_fk foreign key (subjectid) references subject(id),
        constraint identitydocument_id_fk foreign key (identitydocumentid) references identitydocument(id),
        constraint subjectrolcategory_id_fk foreign key (subjectrolcategoryid) references subjectrolcategory(id)
);


INSERT INTO businesssubject(id,subjectid,identitydocumentid,identityNumber,businessname,subjectrolcategoryid,
                    startdate,phones,address,districtid,email,code,provinceid,city,companyid,state,otherreferences,parentid,
                    paymodeid,payrollentrydate,salary,browser_agent,creditcard)
             VALUES(1,1,1,'73170086','anonimos',1,'12-02-2023','945889652','Jr. Grau 578',
             null,'anony@gmail.com','0578',null,'Lima',
             1,1,'Super Administrador',null,null,'12-02-2023',null,'','');