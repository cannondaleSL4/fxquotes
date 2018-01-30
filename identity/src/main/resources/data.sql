/* insert */
INSERT INTO USERROLE (rolename)  VALUES ('ADMIN');
INSERT INTO USERROLE (rolename)  VALUES ('USER');

INSERT INTO USERAPP (email,password)  VALUES ('dima@dima.com','dima');
INSERT INTO USERAPP (email,password)  VALUES ('dima@dima.com','dima');
INSERT INTO USERAPP (email,password)  VALUES ('test@test.com','test');

INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'ADMIN'));

/*
-- INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));
-- INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'test@test.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));
 */