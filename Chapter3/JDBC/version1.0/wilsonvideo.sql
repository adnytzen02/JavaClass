CREATE DATABASE wilsonvideodb;
USE wilsonvideodb;

SOURCE source.sql;

desc video;

INSERT INTO video (videoId,videoName,price) 
values (65,'Harry Potter',66);
INSERT INTO video (videoId,videoName,price) 
values (66,'Avengers',59);


SELECT * FROM video;