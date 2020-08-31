create table book_serv(


    book_id            varchar2(50)        primary key
    , book_user        varchar2(50)        not null
    , book_pw          varchar2(50)        not null
    , book_name        varchar2(50)        not null
    , book_auth        varchar2(50)        not null
    , book_pub         varchar2(50)        not null
    , book_loc         varchar2(50)        not null
    , book_price       varchar2(50)        not null
    , book_indate      date                default sysdate

);