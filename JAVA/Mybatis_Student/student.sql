--�л� ���� ���̺�
create table student (
	id		varchar2(10) primary key,		--�й�
	name	varchar2(20) not null,			--�̸�
	kor		number(3) default 0,			--��������
	eng 	number(3) default 0,			--��������
	mat		number(3) default 0				--��������
);

--�Է� ��
insert into student (id, name, kor, eng, mat) values ('1111', 'ȫ�浿', 100, 90, 80);
commit;
