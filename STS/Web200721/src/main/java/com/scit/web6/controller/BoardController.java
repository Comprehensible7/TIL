package com.scit.web6.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.scit.web6.service.BoardService;
import com.scit.web6.util.FileService;
import com.scit.web6.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	// 파일 저장 경로
	private String uploadPath = "/boardfile";
	
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);


	// 조회
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(Model model) {

		// 글 목록을 조회 후, Model에 저장
		ArrayList<HashMap<String, Object>> list = service.boardList();
		
		model.addAttribute("list", list);
		
		return "board/boardList";
	}

	// 글쓰기 폼으로 이동
	@RequestMapping(value = "/boardWriteForm", method = RequestMethod.GET)
	public String boardWriteForm() {

		return "board/boardWriteForm";
	}

	@RequestMapping(value = "/boardWrite", method = RequestMethod.POST)
	public String boardWrite(BoardVO board , MultipartFile upload) {

		// multipartfile에는 업로드한 파일이 들어감
		
		// upload -> 파일이 있다면 
		if( !upload.isEmpty()) {
			
			// 파일 저장 및 저장경로 설정
			String savedfile = FileService.saveFile(upload, uploadPath);
			
			// 논리적인 저장을 실행
			// 물리적인 저장은 fileservice에서 진행
			board.setSavedfile(savedfile);
			
			// originalfile 저장
			board.setOriginalfile(upload.getOriginalFilename());
			
		}
		
		service.boardWrite(board);

		return "redirect:/board/boardList";
	}
	
	// 업데이트 횟수 포함 조회하기
	@RequestMapping(value="/boardRead",method = RequestMethod.GET)
	public String boardRead(int board_no, Model model) {
		
		HashMap<String, Object> map = service.boardRead(board_no);
		model.addAttribute("map", map);
		
		
		return "board/boardRead";
	}
	
	// 삭제
	@RequestMapping(value="/boardDelete", method = RequestMethod.GET)
	public String boardDelete(int board_no) {
		
		int cnt = service.boardDelete(board_no);
		
		if(cnt == 0) {
			logger.info("삭제실패 : {}", board_no);
			
		}else {
			logger.info("삭제성공 : {}", board_no);
		}
		
		return "redirect:/board/boardList";
		
	}
	
	// 수정 폼
	@RequestMapping(value="/boardUpdateForm",method = RequestMethod.GET)
	public String boardUpdateForm(int board_no, Model model) {
		
		HashMap<String, Object> map = service.boardRead(board_no);
		model.addAttribute("map", map);
		
		return "board/boardUpdateForm";
		
	}
	//수정
	@RequestMapping(value="/boardUpdate", method = RequestMethod.POST)
	public String boardUpdate(BoardVO board) {
		
		int cnt = service.boardUpdate(board);
		
		if(cnt == 0) {
			logger.info("수정 실패 : {}", board);
		} else {
			logger.info("수정 성공 : {}", board);
		}
		
		return "redirect:/board/boardList";
	}
	
	// 검색
	@RequestMapping(value="/searchBoard", method = RequestMethod.GET)
	public String searchBoard(String searchText, String searchType, Model model) {
		
		ArrayList<HashMap<String, Object>> list = service.searchBoard(searchText, searchType);
		
		model.addAttribute("list", list);
		
		return "board/boardList";
	}

}
