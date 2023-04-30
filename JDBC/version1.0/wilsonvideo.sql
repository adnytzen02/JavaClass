CREATE DATABASE wilsonvideodb;
USE wilsonvideodb;

SOURCE source.sql;

desc video;

INSERT INTO video (videoId,videoName,price) 
values (65,Harry Potter,66);

SELECT * FROM video;