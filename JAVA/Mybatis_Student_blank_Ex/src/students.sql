-- �л� ���� ���̺�
create table students(
	id		varchar2(10)	primary key,	-- �й�
	name	varchar2(20)	not null, 		-- �̸�
	kor		number(3)		default 0,		-- ��������
	eng		number(3)		default 0,		-- ��������
	mat		number(3)		default 0		-- ��������
	
);

create sequence students_seq;
