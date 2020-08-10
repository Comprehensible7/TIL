insert into member_tab(
    mem_id      varchar2(30)    primary key
    , mem_pw    varchar2(30)    not null
    , mem_nm    varchar2(30)    not null
    , memb_indate   date        default sysdate
);