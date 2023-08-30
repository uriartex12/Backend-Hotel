CREATE TABLE IF NOT EXISTS subjecttype(
    	id serial primary key,
    	name varchar(50),
    	firstnamedenomination varchar(20),
    	secondnamedenomination varchar(20),
    	classdenomination varchar(50)
);

INSERT INTO subjecttype(id,name,firstnamedenomination,secondnamedenomination,classdenomination)
                    VALUES (1,'Persona Juridica','Nombre Comercial','Razon Social',''),
                           (2,'Person Natural','Nombres','Apellidos','');


