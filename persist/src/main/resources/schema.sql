CREATE TABLE IF NOT EXISTS AUDUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPAUD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPJPY (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPCAD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURJPY (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURAUD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURGBP (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS USDJPY (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS NZDUSD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS USDCAD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);