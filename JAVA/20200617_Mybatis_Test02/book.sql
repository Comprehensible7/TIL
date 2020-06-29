-- 도서 테이블
create table book (
	id			number(10)   	 primary key,		--등록번호
	num			varchar2(30)	 not null,			--도서번호
	name		varchar2(30)     not null,			--도서이름
	price 		varchar2(30)	 default 0,			--도서가격
	company		varchar2(30) 	 not null,			--출판사
	regidate	varchar2(50)	 not null			--등록일자
);

--입력 예
insert into book (id, num, name, price, company, regidate) values ('1', '1','Java' ,'10원', '이것', '20000년');
commit;

-- 시퀀스 생성
create sequence book_seq;
