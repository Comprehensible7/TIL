package com.scit39.a4;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	@RequestMapping(value = "/sendFile", method = RequestMethod.POST)
	public void sendFile(MultipartFile mfile) {
		if (mfile != null) {
			logger.info(mfile.getOriginalFilename());

			File savedFile = new File("/Users/q/Desktop/test/" + mfile.getOriginalFilename());

			try {
				mfile.transferTo(savedFile);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {
			logger.info("파일이 누락되었습니다.");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/sendFileList", method = RequestMethod.POST)
	public void sendFileList(@RequestParam(value = "fileList") MultipartFile[] fileList) {
		if (fileList != null) {
			for (MultipartFile f : fileList) {
				String uploadPath = "/Users/q/Desktop/test/" + f.getOriginalFilename();
				File temp = new File(uploadPath);

				try {
					f.transferTo(temp);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		} else {
			logger.info("파일이 누락되었습니다.");
		}
	}

}
