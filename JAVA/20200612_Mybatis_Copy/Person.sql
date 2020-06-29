-- 개인 정보 테이블
create table person(
	  num			number		primary key
	, name			varchar2(20)	not null
	, age			number(3)
);

-- 개인정보 테이블의 일련번호에 사용할 시퀀스
create sequence person_seq;

insert into 
	person(
		num
		, name
		, age
	)values(
		person_seq.nextVal
		,#{name}
		,#{age}
	);