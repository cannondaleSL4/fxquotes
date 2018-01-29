/* insert */
INSERT INTO USERROLE (rolename)  VALUES ('ADMIN');
INSERT INTO USERROLE (rolename)  VALUES ('USER');

INSERT INTO USERAPP (email,password,id_role)  VALUES ('dima@dima.com','dima',(SELECT id_role FROM USERROLE WHERE rolename = 'ADMIN'));
INSERT INTO USERAPP (email,password,id_role)  VALUES ('test@test.com','test',(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));