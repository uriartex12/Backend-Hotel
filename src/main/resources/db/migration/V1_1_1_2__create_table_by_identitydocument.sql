CREATE TABLE IF NOT EXISTS identitydocument(
    	id serial primary key,
    	shortname varchar(50),
    	fullname varchar(50),
    	length int4,
    	mask varchar(50),
    	legacydetail varchar(50),
    	isprimary bit(1),
    	isforbusiness bit(1)
);


INSERT INTO identitydocument (id, shortname, fullname, length, mask, legacydetail, isprimary, isforbusiness)
        VALUES
            (1, 'DNI', 'Documento Nacional de Identidad', 8, '', '', B'0', B'0'),
            (2, 'RUC', 'RUC', 11, '', '', B'0', B'0'),
            (3, 'CARNET EXT', 'CARNET EXTRANJERIA', 12, '', '', B'0', B'0'),
            (4, 'PASAPORTE', 'PASAPORTE', 12, '', '', B'0', B'0');
