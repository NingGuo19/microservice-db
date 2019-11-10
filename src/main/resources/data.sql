DROP TABLE IF EXISTS INVESTOR;

CREATE TABLE Investor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

INSERT INTO Investor (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

DROP TABLE IF EXISTS TICKERS;

CREATE TABLE TICKERS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  ticker_name VARCHAR(250) NOT NULL
);

INSERT INTO TICKERS (ticker_name ) VALUES
  ('GOOGL'),
  ('AAPL'),
  ('TWTR'),
  ('BABA'),
  ('CSCO'),
  ('C'),
  ('MS'),
  ('GS'),
  ('BHP'),
  ('FB');

DROP TABLE IF EXISTS INVESTOR_TICKERS;

CREATE TABLE INVESTOR_TICKERS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  INVESTOR_ID INT NOT NULL,
  TICKER_ID INT NOT NULL
);

INSERT INTO Investor_Tickers (investor_id, ticker_id ) VALUES
  (1,1),
  (1,2),
  (1,3),
  (2,4),
  (2,5),
  (2,6),
  (3,7),
  (3,8),
  (3,9);
