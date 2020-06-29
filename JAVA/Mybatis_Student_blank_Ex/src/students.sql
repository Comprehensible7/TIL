-- 학생 성적 테이블
create table students(
	id		varchar2(10)	primary key,	-- 학번
	name	varchar2(20)	not null, 		-- 이름
	kor		number(3)		default 0,		-- 국어점수
	eng		number(3)		default 0,		-- 영어점수
	mat		number(3)		default 0		-- 수학점수
	
);

create sequence students_seq;
