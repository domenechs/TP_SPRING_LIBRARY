INSERT INTO LIBRARY (IDENTIFIANT,CODE_POSTAL,NUMERO,RUE,VILLE,NOM_DIRECTEUR,PRENOM_DIRECTEUR,TYPE) VALUES ('1',75001,1,'Moliere','PARIS','DURAND','Gilles','ASSOCIATIVE');
INSERT INTO LIBRARY (IDENTIFIANT,CODE_POSTAL,NUMERO,RUE,VILLE,NOM_DIRECTEUR,PRENOM_DIRECTEUR,TYPE) VALUES ('2',75002,2,'De Gaulles','PARIS','DURAND','Gilles','NATIONAL');
INSERT INTO LIBRARY (IDENTIFIANT,CODE_POSTAL,NUMERO,RUE,VILLE,NOM_DIRECTEUR,PRENOM_DIRECTEUR,TYPE) VALUES ('3',75003,3,'Bourrelier','PARIS','DUPOND','Marcel','PUBLIQUE');
INSERT INTO LIBRARY (IDENTIFIANT,CODE_POSTAL,NUMERO,RUE,VILLE,NOM_DIRECTEUR,PRENOM_DIRECTEUR,TYPE) VALUES ('4',75004,4,'Resistance','PARIS','GRAND','Louis','SCOLAIRE');
INSERT INTO LIBRARY (IDENTIFIANT,CODE_POSTAL,NUMERO,RUE,VILLE,NOM_DIRECTEUR,PRENOM_DIRECTEUR,TYPE) VALUES ('5',75005,5,'Foch','PARIS','GRAND','Louis','UNIVERSITAIRE');
INSERT INTO LIBRARY (IDENTIFIANT,CODE_POSTAL,NUMERO,RUE,VILLE,NOM_DIRECTEUR,PRENOM_DIRECTEUR,TYPE) VALUES ('6',75006,6,'Zerktouni','PARIS','FANFAN','La Tulipe','ASSOCIATIVE');

INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (1,'Tolkien','FANTASTIQUE','SBN0001',800,'Le seigneur des anneaux','1');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (2,'SPIELBERG','SCIENCE_FICTION','SBN0002',500,'Star war','2');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (3,'KING','DRAME','SBN0003',1800,'Shining','2');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (4,'KING','DRAME','SBN0004',100,'Christine','3');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (5,'Herge','HISTOIRE','SBN0005',12800,'Tintin','4');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (6,'Tolkien','FANTASTIQUE','SBN0001',800,'Le seigneur des anneaux','1');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (7,'KING','DRAME','SBN0003',1800,'Shining','5');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (8,'Tolkien','FANTASTIQUE','SBN0001',800,'Le seigneur des anneaux','5');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (9,'KING','DRAME','SBN0003',1800,'Shining','2');
INSERT INTO LIVRE (IDENTIFIANT,AUTEUR,GENRE,ISBN,NOMBRE_DE_PAGE,TITRE,LIBRARY_ID) VALUES (10,'Tolkien','FANTASTIQUE','SBN0001',800,'Le seigneur des anneaux','6');

--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('1',1);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('1',2);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('2',3);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('3',6);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('3',7);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('4',8);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('5',4);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('6',5);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('6',9);
--INSERT INTO LIBRARY_LIVRES (LIBRARY_ID,LIVRES_ID) VALUES ('6',10);
