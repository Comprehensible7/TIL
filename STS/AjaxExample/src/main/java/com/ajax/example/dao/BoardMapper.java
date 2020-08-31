package com.ajax.example.dao;

import java.util.ArrayList;

import com.ajax.example.vo.BoardVO;
import com.ajax.example.vo.ReplyVO;

public interface BoardMapper {

	public ArrayList<BoardVO> getBoardList();

	public BoardVO getBoard(int boardNum);

	public ArrayList<ReplyVO> getReplyList(int boardNum);

}
