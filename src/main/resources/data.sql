--会議室
INSERT INTO meeting_room (room_name,room_id) values('新木場',1);
INSERT INTO meeting_room (room_name,room_id) values('辰巳',2);
INSERT INTO meeting_room (room_name,room_id) values('豊洲',3);
INSERT INTO meeting_room (room_name,room_id) values('月島',4);
INSERT INTO meeting_room (room_name,room_id) values('成増',5);

--会議室の予約可能日(room_idが２〜６用のSQLは省略)
--room_id=1(新木場)の予約可能日(修正）
INSERT INTO reservable_room(reserved_date,room_id) values(current_date,1);



--room_id=5(成増)の予約可能日(修正）
INSERT INTO reservable_room(reserved_date,room_id) values(current_date,5);


--ダミーユーザー（password=demo)
INSERT INTO usr (user_id,first_name,last_name,password,role_name) values('tato-yamada','太郎','山田',
'$2a$10$oxSJI.keBwxmsMLkcT9kPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK',"USER");

INSERT INTO usr (user_id,first_name,last_name,password,role_name) values('kiku-shige','茂雄','菊池',
'$2a$10$oxSJI.keBwxmsMLkcT9kPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK',"USER");

INSERT INTO usr (user_id,first_name,last_name,password,role_name) values('ken-tanabe','健','田辺',
'$2a$10$oxSJI.keBwxmsMLkcT9kPeAIxfNTPNQxpeywMrF7A3kVszwUTqfTK',"ADMIN");




