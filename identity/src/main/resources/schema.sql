CREATE TABLE IF NOT EXISTS userapp (
  id_client integer not null auto_increment,
  name VARCHAR(45) NOT NULL UNIQUE,
  password VARCHAR(45) NOT NULL,
  user_group VARCHAR(45) NOT NULL,
  CHECK (user_group IN ('owner','user'))
);