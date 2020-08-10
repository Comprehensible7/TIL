package com.scit39.test20.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.test20.service.PersonService;
import com.scit39.test20.vo.Person;

@Controller
public class InputController {

	// 로거 사용
	// InputController를 class화 해서 logger를 연결해줌
	private static final Logger logger = LoggerFactory.getLogger(InputController.class);

	// PersonService를 연결
	@Autowired
	private PersonService service;

	// 입력폼을 연결
	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String goInputForm() {

		logger.info("입력폼으로 이동");

		// 포워드 방식은 값이 그대로 남아있기때문에 조회때만 사용한다 (select)
		return "inputForm";

	}

	// 입력값을 보내주는 부분이라 Post처리한다
	// inputForm부분의 action값이 들어간다
	@RequestMapping(value = "input", method = RequestMethod.POST)
	// 데이터 입력을 위한 vo클래스를 매개변수로 받아옴
	public String insertPerson(Person person) {

		logger.debug("폼으로부터 전달된 정보 : {}", person.toString());

		// 인트형으로 리턴받기위한 임시변수 선언
		int cnt = service.insertPerson(person);

		if (cnt == 0) {
			logger.info("회원 가입 실패");
		} else {
			logger.info("회원 가입 성공");
		}

		// 값을 등록, 수정, 삭제, 어레이리스트 등 동일함
		return "redirect:/";
	}

}
