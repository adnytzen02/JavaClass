create table video (
    videoId int auto_increment primary key,
    videoName varchar(50) null,
    price int null,
    constraint video_videoId_uindex unique(videoId)
)