CREATE TABLE IF NOT EXISTS subjectrol(
    	id serial primary key,
    	name varchar(100),
    	description varchar(255),
    	subjectrolcategoryid int4 NOT NULL,
    	isdefault int4,
    	constraint subjectrolcategory_id_fk foreign key (subjectrolcategoryid) references subjectrolcategory(id)
);

INSERT INTO subjectrol(id,name,description,subjectrolcategoryid,isdefault)
                       VALUES (1,'Cliente nuevo','Los clientes nuevos',1,0),
                              (2,'Empleado por Locacion','empleados por Contrato',2,0),
                              (3,'Caja','',2,0),
                              (4,'Administrador','',2,0),
                              (5,'SSA','Super Admin',2,0),
                              (6,'Recepcion','Personal encargado de atender a los clientes',2,0);