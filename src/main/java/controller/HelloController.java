package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/first")
public class HelloController {
	@RequestMapping(value = "/caller1.he", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("greeting", "안녕하세요");
		model.addAttribute("message", "2021년 희망의 새해가 왔군요");
		System.out.println("HelloController 클래스의 home 메소드 호출됨");
		return "hello";
	}
	
	@RequestMapping(value = "/hohoho.he", method = RequestMethod.GET)
	public ModelAndView hohoho() {
		ModelAndView mav = new ModelAndView("hohoho");
		
		mav.addObject("hohoho", "안녕하세요 호호호");
		
		//ModelAndView mav 
		//= new ModelAndView("hohoho", "hohoho", "안녕하세요 호호호");
		
		List<String> lists = new ArrayList<String>();

		lists.add("가나");
		lists.add("다라");
		lists.add("마바");
		mav.addObject("lists", lists ) ;
		
		return mav;		
	}
}