CREATE TABLE IF NOT EXISTS AUDUSD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPAUD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPJPY5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPCAD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURJPY5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURAUD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURGBP5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS EURUSD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPUSD5 (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currencyname VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  hight numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  data DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS USDJPY5 (
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