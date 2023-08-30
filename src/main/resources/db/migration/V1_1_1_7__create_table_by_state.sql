CREATE TABLE IF NOT EXISTS state(
    	id serial primary key,
    	name varchar(50),
    	description varchar(250),
    	entityname varchar(100),
    	ordernumber int4
);

INSERT INTO state(id,name,description,entityname,ordernumber)
                                VALUES (1,'Activo','Para el estado de los usuarios','us',1),
                                       (2,'Inactivo','Para el estado de los usuarios','us',1),
                                       (3,'Ocupado','Para el estado de habitaciones','ha',2),
                                       (4,'Limpieza','habitacion en limpieza','ha',2),
                                       (5,'Disponible','habitacion disponible','ha',2),
                                       (6,'Mantenimiento','habitacion en matenimiento','ha',2);