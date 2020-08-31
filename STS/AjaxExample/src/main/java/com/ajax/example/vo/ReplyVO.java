package com.ajax.example.vo;

public class ReplyVO {
	private int replyNum;
	private int boardNum;
	private String writer;
	private String indate;
	private String content;
	
	public ReplyVO() {
		// TODO Auto-generated constructor stub
	}

	public ReplyVO(int replyNum, int boardNum, String writer, String indate, String content) {
		super();
		this.replyNum = replyNum;
		this.boardNum = boardNum;
		this.writer = writer;
		this.indate = indate;
		this.content = content;
	}

	public int getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ReplyVO [replyNum=" + replyNum + ", boardNum=" + boardNum + ", writer=" + writer + ", indate=" + indate
				+ ", content=" + content + "]";
	}
	
}
