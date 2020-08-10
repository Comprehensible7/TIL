package global.sesoc.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 메인 화면으로 이동하는 요청 처리
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		// log서버에서도 출력이됨, 파일로도 저장됨
		// log레벨에따라서 출력 구문을 설정가능
		logger.info("메인 화면으로 이동");
		// syso는 개발환경의 콘솔에서만 출력되는녀석임
		// syso는 서버에서는 안보임...!
		return "home";
	}
	
}
