create table board_table (
    boardNum number primary key,
    title varchar2(1000) not null,
    writer varchar2(300) not null,
    content varchar2(3000),
    indate date default sysdate
);

create sequence board_table_seq nocache;

insert into board_table values (
    board_table_seq.nextval,
    '�׽�Ʈ ����2',
    'ADMIN',
    '�׽�Ʈ ����2',
    sysdate
);

commit;

create table reply_table (
    replyNum number primary key,
    boardNum number references board_table,
    writer varchar2(300) not null,
    indate date default sysdate,
    content varchar2(3000)
);

create sequence reply_table_seq nocache;

insert into reply_table values (
    reply_table_seq.nextval,
    1,
    'USER',
    sysdate,
    '�׽�Ʈ ���2'
);

commit;