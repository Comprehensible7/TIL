package com.ajax.example;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajax.example.service.BoardService;
import com.ajax.example.vo.BoardVO;
import com.ajax.example.vo.ReplyVO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService service;
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(Model model) {
		logger.info("boardList 메서드 실행.");
		
		ArrayList<BoardVO> list = service.getBoardList();
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@RequestMapping(value = "/readBoard", method = RequestMethod.GET)
	public String readBoard(Model model, int boardNum) {
		logger.info("readBoard 메서드 실행.");
		
		BoardVO board = service.getBoard(boardNum);
		model.addAttribute("board", board);
		
		return "board/readBoard";
	}
	
	@ResponseBody
	@RequestMapping(value = "/readReply", method = RequestMethod.POST)
	public ArrayList<ReplyVO> readReply(int boardNum) {
		logger.info("readReply 메서드 실행.");
		
		ArrayList<ReplyVO> list = service.getReplyList(boardNum);
		
		return list;
	}
	
}
