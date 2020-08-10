create table member_tb(

    member_id           varchar2(30)    primary key
    , member_pw         varchar2(30)    NOT NULL
    , member_nm         varchar2(30)    NOT NULL
    , member_birth      varchar2(10)    NOT NULL
    , member_indate     date            DEFAULT sysdate
    
);