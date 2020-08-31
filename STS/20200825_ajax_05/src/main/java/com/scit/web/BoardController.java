package com.scit.web;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web.service.BoardService;
import com.scit.web.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	private BoardService service;
	
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String boardList(Model model) {
		logger.info("boardList 메서드 실행");
		
		ArrayList<BoardVO> list = service.getBoardList();
		model.addAttribute("list", list);
		
		
		return "/board/boardList";
	}
}
