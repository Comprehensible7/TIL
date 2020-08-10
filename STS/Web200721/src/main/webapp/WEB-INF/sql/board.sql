create table board_table (
	board_no			number 		    	primary key	
	,member_id		    varchar2(20) 		not null
	,board_title		varchar2(200) 		not null
	,board_context		varchar2(2000)		not null
	,board_indate		date    			default sysdate
	,board_hits		    number 	    		default 0	
	,originalfile		varchar2(200)	
	,savedfile			varchar2(100)
	,constraint board_fk foreign key(member_id)
		references member_table(member_id) on delete cascade
);


create sequence board_seq;



// 테이블 조인

select
    b.board_no
    , b.member_id
    , b.board_title
    , b.board_context
    , to_char(b.board_indate,'YYYY-MM-DD') as board_indate
    , b.board_hits
    , m.member_nm
    
from
    board_table b, member_table m
    
where 
    b.member_id = m.member_id

order by
    board_no desc;
    
    
    
    // hashmap 사용
    
    <select id="boardList" resultType="hashmap">

select
    b.board_no as board_no // 뒤에 별칭이 키값임, 결과로 나오는값이 밸류값
    , b.member_id as member_id
    , b.board_title as_board_title
    , b.board_context as board_context
    , to_char(b.board_indate,'YYYY-MM-DD') as board_indate
    , b.board_hits as board_hits
    , m.member_nm as member_nm
    
from
    board_table b, member_table m
    
where 
    b.member_id = m.member_id

order by
    board_no desc

</select>