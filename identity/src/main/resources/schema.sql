CREATE TABLE IF NOT EXISTS USERROLE (
  id_role integer AUTO_INCREMENT,
  rolename VARCHAR(10) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS USERAPP (
  id_user integer AUTO_INCREMENT,
  email VARCHAR(320) NOT NULL UNIQUE ,
  password VARCHAR(45) NOT NULL,
  is_active BOOLEAN
);

CREATE TABLE IF NOT EXISTS USER_ROLE(
  id_user_role integer AUTO_INCREMENT,
  id_role integer, FOREIGN KEY (id_role) REFERENCES USERROLE (id_role),
  id_user integer, FOREIGN KEY (id_user) REFERENCES USERAPP (id_user)
);