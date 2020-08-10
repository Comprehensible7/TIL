create table student_tb(

    student_id          varchar2(30)        primary key
    , student_pw        varchar2(30)        not null
    , studnet_nm        varchar2(30)        not null
    , student_subject   varchar2(50)        not null
    , student_indate    date                default sysdate

);


select * from student_tb;