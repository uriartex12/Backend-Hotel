CREATE TABLE IF NOT EXISTS subjectrolcategory(
    	id serial primary key,
    	name varchar(100),
    	description varchar(255)
);

INSERT INTO subjectrolcategory(id,name,description)
                       VALUES (1,'Cliente','El que hace las compras'),
                              (2,'Personal','Encargado de realizar todo tipo de ventas');
