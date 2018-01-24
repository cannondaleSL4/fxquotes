CREATE TABLE IF NOT EXISTS USERAPP (
  id integer not null auto_increment,
  email VARCHAR(320) NOT NULL UNIQUE,
  password VARCHAR(45) NOT NULL,
  user_group VARCHAR(45) NOT NULL,
  CHECK (user_group IN ('OWNER','USER'))
);