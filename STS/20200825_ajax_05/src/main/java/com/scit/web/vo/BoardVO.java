package com.scit.web.vo;

import lombok.Data;

@Data
public class BoardVO {

	private int boardNum;	//글 번호
	private String title;	//제목
	private String writer;	//작성자
	private String content;	//본문
	private String indate;	//작성일
	
}
