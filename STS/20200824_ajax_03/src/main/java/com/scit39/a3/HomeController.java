package com.scit39.a3;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {

		return "test1";
	}

	@ResponseBody
	@RequestMapping(value = "/sendArray", method = RequestMethod.POST)
	public void sendArray(String[] arr) {
		logger.info("sendArray 메서드 실행");
		if (arr != null) {
			for (String s : arr)
				logger.info("페이지로부터 전달받은 데이터: {}", s);
		} else {
			logger.info("페이지로부터 전달받은 데이터: {}", arr);

		}
	}

	@ResponseBody
	@RequestMapping(value = "/sendVO", method = RequestMethod.POST)
	public void sendVO(UserVO user) {
		logger.info("sendVO 메서드 실행");
		logger.info("페이지로부터 전달받은 데이터: {}", user);

	}

	// JSON기능 pom.xml확인
	@ResponseBody
	@RequestMapping(value = "/receiveArray", method = RequestMethod.POST)
	public String[] receiveArray() {
		logger.info("receiveArray 메서드 실행");

		String[] arr = new String[2];

		arr[0] = "asdf";
		arr[1] = "1234";

		return arr;
	}

	// JSON기능 pom.xml확인
	@ResponseBody
	@RequestMapping(value = "/receiveVO", method = RequestMethod.POST)
	public UserVO receiveVO() {
		logger.info("receiveVO 메서드 실행");

		return new UserVO("asdf", "1234");
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {

		return "test2";
	}

	// JSON보낼때 @확인
	@ResponseBody
	@RequestMapping(value = "/sendJSON", method = RequestMethod.POST)
	public void sendJSON(@RequestBody UserVO user) {
		logger.info("sendJSON 메서드 실행");
		logger.info("페이지로부터 전달받은 데이터: {}", user);

	}

	// JSON기능 pom.xml확인
	@ResponseBody
	@RequestMapping(value = "/receiveJSON", method = RequestMethod.POST)
	public UserVO receiveJSON() {
		logger.info("receiveJSON 메서드 실행");

		UserVO user = new UserVO("asdf", "1234");

		return user;
	}

	// JSON보낼때 @확인
	@ResponseBody
	@RequestMapping(value = "/sendList", method = RequestMethod.POST)
	public void sendList(@RequestBody ArrayList<String> list) {
		logger.info("sendList 메서드 실행");
		logger.info("페이지로부터 전달받은 데이터: {}", list);

	}

	// JSON보낼때 @확인
	@ResponseBody
	@RequestMapping(value = "/sendMap", method = RequestMethod.POST)
	public void sendMap(@RequestBody HashMap<String, Object> map) {
		logger.info("sendMap 메서드 실행");
		logger.info("페이지로부터 전달받은 데이터: {}", map);

	}

	// JSON기능 pom.xml확인
	@ResponseBody
	@RequestMapping(value = "/receiveList", method = RequestMethod.POST)
	public ArrayList<String> receiveList() {
		logger.info("receiveList 메서드 실행");

		ArrayList<String> list = new ArrayList<String>();
		list.add("asdf");
		list.add("1234");

		return list;
	}

	// JSON기능 pom.xml확인
	@ResponseBody
	@RequestMapping(value = "/receiveMap", method = RequestMethod.POST)
	public HashMap<String, Object> receiveMap() {
		logger.info("receiveMap 메서드 실행");

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userid", "asdf");
		map.put("userpw", "1234");

		return map;
	}

}
