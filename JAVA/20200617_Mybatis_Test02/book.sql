-- ���� ���̺�
create table book (
	id			number(10)   	 primary key,		--��Ϲ�ȣ
	num			varchar2(30)	 not null,			--������ȣ
	name		varchar2(30)     not null,			--�����̸�
	price 		varchar2(30)	 default 0,			--��������
	company		varchar2(30) 	 not null,			--���ǻ�
	regidate	varchar2(50)	 not null			--�������
);

--�Է� ��
insert into book (id, num, name, price, company, regidate) values ('1', '1','Java' ,'10��', '�̰�', '20000��');
commit;

-- ������ ����
create sequence book_seq;
