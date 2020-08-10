create table student_tbs(

    s_id            varchar2(30)        primary key
    , s_name        varchar2(50)        not null
    , s_pw          varchar2(50)        not null
    , s_birth       varchar2(50)        not null
    , s_loc         varchar2(50)        not null
    , s_subject     varchar2(50)        not null
    , s_indate      date                default sysdate

);