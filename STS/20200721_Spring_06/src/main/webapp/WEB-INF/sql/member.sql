create table member_table(

    member_id           varchar2(30)        primary key
    , member_pw         varchar2(30)        not null
    , member_nm         varchar2(30)        not null
    , member_indate     date                default sysdate
    
);

