-- person 개인 정보 테이블 생성
create table person(
	  num		number	primary key
	, name		varchar2(20)	not null
	, age		number(3)
	
);

-- person 개인정보 테이블의 일련번호에 사용할 시퀀스 생성하기
create sequence person_seq;

-- xml에 insert해줄 값 넣기(person)

insert into 
	person(
	num
	, name
	, age
	
	)values(
	person_seq.nextVal
	,#{name}
	,#{age}
	)