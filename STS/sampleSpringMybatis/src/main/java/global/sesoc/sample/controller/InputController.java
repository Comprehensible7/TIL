package global.sesoc.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.sample.service.PersonService;
import global.sesoc.sample.vo.Person;

/**
 * 사용자 입력을 받아 처리
 */
@Controller
public class InputController {
	
	private static final Logger logger = LoggerFactory.getLogger(InputController.class);

	@Autowired
	private PersonService service;

	/**
	 * 입력 폼으로 이동
	 * @return
	 */
	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String goInputForm() {
		// 출력구문임
		// 해당클래스에서 사용 시 클래스명 + 입력한 메세지 내용이 출력됨
		// 로그레벨설정은 resources의 log4k.xml에 들어가면 설정 가능하다
		// 입력값을 검증하려면 level부분을 debug로 변경하면 사용 가능
		logger.info("입력 폼으로 이동");
		return "inputForm";
		// 얘가 포워드 방식임.
		// 해당 url그대로 넘어감 (요청시... 데이터를 그대로 유지하고 넘어감)
		// 요청 주소, 데이터 그대로 남아있어서 새로고침시 똑같은 동작을 한번 더 실행가능
		// forward는 데이터를 조회할때만 사용(select)
		
	}
	
	@RequestMapping(value="input", method = RequestMethod.POST)
	public String insertPerson(Person person) {
		// 아래의 {}부분에 내용을 출력하겠다 라는의미
		logger.debug("폼으로부터 전달된 정보 : {}", person.toString());
		int cnt = service.insertPerson(person);
		
		if(cnt == 0) {
			logger.info("회원 가입 실패");
		}else {
			logger.info("회원 가입 성공");
		}
		
		// 리다이렉트를 하고싶은 요청주소를 작성한다
		// return "redirect: + 요청주소(/)";
		// 인풋 폼으로 가려면 redirect:/inputForm 이렇게 입력		
		return "redirect:/";
		// 새로운 리퀘스트 스코프가 생김
		
		// 지금까지 리턴방식 지정해줬던것은 forward방식임, 바로 jsp로 돌아가는것
		// forward방식은 데이터가 조작이 되는상황일때는 사용하면 안됨
		// 등록, 수정, 삭제 이때는 forward를 사용하면 절대 안됨
		// 어레이 리스트애서 등록 수정 삭제 할때도 동일함
		
		// redirect는 사용자가 요청을 보내면 바로 jsp로 가는것이 아니라
		// 리다이렉트하는곳의 요청주소가 변경된다.
		// 시용자가 요청했던 주소가 남아있는것이 아니라 리다이렉트 했던 주소로 변경됨
		// 리다이렉트시 데이터 모두 소멸, 요청주소가 변경됨
		// 리퀘스트 스코프의 데이터가 모두 소멸된다고 보면됨
	}
}
