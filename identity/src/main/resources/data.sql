/* insert */
INSERT INTO USERROLE (id_role,rolename)  VALUES (1,'ADMIN');
INSERT INTO USERROLE (id_role,rolename)  VALUES (2,'USER');

INSERT INTO USERAPP (id_user,email,password,is_active)  VALUES (1,'dima@dima.com','dima',TRUE );
INSERT INTO USERAPP (id_user,email,password,is_active)  VALUES (2,'test@test.com','test',TRUE );

INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'ADMIN'));
-- INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));
INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'test@test.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));
