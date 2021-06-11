package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Controller를 객체화 하기 위한 Annotation 설정
@Controller
public class AlbumInsertController {
//	@PostMapping
	@RequestMapping(value = "/insert.al", method = RequestMethod.GET)
	public String doGet() {
		return null;
	} // doGet 끝
	
	@RequestMapping(value = "/insert.al", method = RequestMethod.POST)
	public String doPost() {
		return null;
	} // doPost 끝
} // Class 끝
