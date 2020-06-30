-- person ���� ���� ���̺� ����
create table person(
	  num		number	primary key
	, name		varchar2(20)	not null
	, age		number(3)
	
);

-- person �������� ���̺��� �Ϸù�ȣ�� ����� ������ �����ϱ�
create sequence person_seq;

-- xml�� insert���� �� �ֱ�(person)

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