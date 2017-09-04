insert into user (email) values('younggyu.kim@oracle.com');
insert into user (email) values('jupil.hwang@oracle.com');
insert into user (email) values('sunghye.jeon@oracle.com');
insert into user (email) values('inho.kang@oracle.com');

insert into seat (seat_no, location) values('12042', '12F South');
insert into seat (seat_no, location) values('12044', '12F South');
insert into seat (seat_no, location) values('12046', '12F South');
insert into seat (seat_no, location) values('12048', '12F South');
insert into seat (seat_no, location) values('12050', '12F South');

insert into reservation (user_id, seat_id, reservation_date, starting_time, ending_time, status, reserved_at, last_modified_at) 
    values (1, 1, STR_TO_DATE('2017-09-05', '%Y-%m-%d'), STR_TO_DATE('2017-09-05 09', '%Y-%m-%d %H'), STR_TO_DATE('2017-09-05 18', '%Y-%m-%d %H'), 1, now(), now());
insert into reservation (user_id, seat_id, reservation_date, starting_time, ending_time, status, reserved_at, last_modified_at) 
    values (2, 2, STR_TO_DATE('2017-09-05', '%Y-%m-%d'), STR_TO_DATE('2017-09-05 09', '%Y-%m-%d %H'), STR_TO_DATE('2017-09-05 18', '%Y-%m-%d %H'), 1, now(), now());
insert into reservation (user_id, seat_id, reservation_date, starting_time, ending_time, status, reserved_at, last_modified_at) 
    values (3, 4, STR_TO_DATE('2017-09-05', '%Y-%m-%d'), STR_TO_DATE('2017-09-05 09', '%Y-%m-%d %H'), STR_TO_DATE('2017-09-05 18', '%Y-%m-%d %H'), 1, now(), now());    


select * from seat where id not in 
	(select seat_id from reservation where starting_time >= str_to_date('2017-09-05 09', '%Y-%m-%d %H') and ending_time <= str_to_date('2017-09-05 18', '%Y-%m-%d %H'));
