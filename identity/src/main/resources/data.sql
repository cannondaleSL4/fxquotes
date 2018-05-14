/* insert */
INSERT INTO USERROLE (id_role,rolename)  VALUES (1,'ADMIN');
INSERT INTO USERROLE (id_role,rolename)  VALUES (2,'USER');

INSERT INTO USERAPP (id_user,email,password,is_active)  VALUES (1,'dima@dima.com','dima',TRUE );
INSERT INTO USERAPP (id_user,email,password,is_active)  VALUES (2,'test@test.com','test',TRUE );

-- INSERT INTO USER_ROLE (id_user_role,id_user,id_role) VALUES (1,(SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'ADMIN'));
-- INSERT INTO USER_ROLE (id_user_role,id_user,id_role) VALUES (2,(SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));
-- INSERT INTO USER_ROLE (id_user_role,id_user,id_role) VALUES (3,(SELECT id_user FROM USERAPP WHERE email = 'test@test.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));

-- INSERT INTO USER_ROLE (id_user_role,id_role,id_user) VALUES(1,1,1);
-- INSERT INTO USER_ROLE (id_user_role,id_role,id_user) VALUES(2,2,1);
-- INSERT INTO USER_ROLE (id_user_role,id_role,id_user) VALUES(3,2,2);
--



-- CREATE TABLE IF NOT EXISTS USER_ROLE(
--   id_user_role integer AUTO_INCREMENT,
--   id_role integer, FOREIGN KEY (id_role) REFERENCES USERROLE (id_role),
--   id_user integer, FOREIGN KEY (id_user) REFERENCES USERAPP (id_user)
-- );
