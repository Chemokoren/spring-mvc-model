CREATE DATABASE IF NOT EXISTS 'springit';
USE 'springit';

/*
*TABLE STRUCTURE FOR TABLE 'COMMENT'
*/


CREATE TABLE 'comment'(
'id' bigInt(20) NOT NULL AUTO_INCREMENT,
'created_by' varchar(255) DEFAULT NULL,
'creation_date', datetime DEFAULT NULL,
'last_modified_by' varchar(255) DEFAULT NULL,
'last_modified_date' datetime DEFAULT NULL,
'body' varchar(255) DEFAULT NULL,
'link_id' bigint(20) DEFAULT NULL,
PRIMARY KEY('id'),
KEY 'xxxxxxxxxxxxxxxxx'('link_id')
)ENGINE=MYISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


#

# Table structure for table 'link'

#

DROP TABLE IF EXISTS 'link';
CREATE TABLE 'link'(
'id' bigInt(20) NOT NULL AUTO_INCREMENT,
'created_by' varchar(255) DEFAULT NULL,
'creation_date', datetime DEFAULT NULL,
'last_modified_by' varchar(255) DEFAULT NULL,
'last_modified_date' datetime DEFAULT NULL,
'title' varchar(255) DEFAULT NULL,
'url' varchar(255) DEFAULT NULL,
PRIMARY KEY('id'),
)ENGINE=MYISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
