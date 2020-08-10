package com.scit.web6.vo;

import lombok.Data;

@Data
public class BoardVO {

	private int board_no;
	private String member_id;
	private String board_title;
	private String board_context;
	private String board_indate;
	private int board_hits;
	private String originalfile;
	private String savedfile;

}
