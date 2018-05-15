/* insert */
INSERT INTO USERROLE (rolename)  VALUES ('ADMIN');
INSERT INTO USERROLE (rolename)  VALUES ('USER');

INSERT INTO USERAPP (email,password,is_active)  VALUES ('dima@dima.com','dima',TRUE );
INSERT INTO USERAPP (email,password,is_active)  VALUES ('test@test.com','test',TRUE );

INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'ADMIN'));
INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'dima@dima.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));
INSERT INTO USER_ROLE (id_user,id_role) VALUES ((SELECT id_user FROM USERAPP WHERE email = 'test@test.com'),(SELECT id_role FROM USERROLE WHERE rolename = 'USER'));

-- INSERT INTO USER_ROLE (id_user_role,id_role,id_user) VALUES(1,1,1);
-- INSERT INTO USER_ROLE (id_user_role,id_role,id_user) VALUES(2,2,1);
-- INSERT INTO USER_ROLE (id_user_role,id_role,id_user) VALUES(3,2,2);


-- CREATE TABLE IF NOT EXISTS USER_ROLE(
--   id_user_role integer AUTO_INCREMENT,
--   id_role integer, FOREIGN KEY (id_role) REFERENCES USERROLE (id_role),
--   id_user integer, FOREIGN KEY (id_user) REFERENCES USERAPP (id_user)
-- );
