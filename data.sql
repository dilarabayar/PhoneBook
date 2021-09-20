
CREATE DATABASE phonebook;

USE phonebook;
CREATE TABLE contact (Id int primary key NOT NULL AUTO_INCREMENT,
 name VARCHAR(30) NOT NULL, phone VARCHAR(30) NOT NULL);

INSERT INTO contact (name, phone) VALUES ("Dilara", "5347669701");
INSERT INTO contact (name, phone) VALUES ("Ahmet", "9055554789021");