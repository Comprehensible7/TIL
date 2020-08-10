create table hospital_serv(

    h_no        varchar2(30)            primary key             // 진료번호
    , h_sec     varchar2(50)            not null                // 진료과
    , h_loc     varchar2(50)            not null                // 위치
    , h_doc     varchar2(50)            not null                // 의사명
    , h_sup     varchar2(50)            not null                // 담당 간호사
    , h_info    varchar2(100)           not null                // 환자기록
    , h_res     varchar2(100)           not null                // 진단명
    , h_indate  date                    default sysdate         // 진료날짜
    , h_price   varchar2(100)           not null                // 진료비


);