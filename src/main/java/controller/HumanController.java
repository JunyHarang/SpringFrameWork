package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Hobby;
import model.Human;
import model.Job;

//@Controller를 적어줘야 human-context.xml에서 스캐닝이된다.
@Controller
public class HumanController {
	@ModelAttribute("human")
	public Human some() {
		return new Human();
	}
	
	@ModelAttribute("hobbies")
	public List<Hobby> hobby_list(){
		//컬렉션 생성
		List<Hobby> lists = new ArrayList<Hobby>();
		
		lists.add(new Hobby("reading", "독서"));
		lists.add(new Hobby("movie", "영화감사"));
		lists.add(new Hobby("baseball", "야구"));
		lists.add(new Hobby("football", "축구"));
		
		return lists;
	}
	
	@ModelAttribute("joblists")
	public List<Job> job_list(){
		List<Job> lists = new ArrayList<Job>();
		
		lists.add(new Job(0, "--선택해 주세요"));
		lists.add(new Job(1, "학생"));
		lists.add(new Job(2, "강사"));
		lists.add(new Job(3, "직원"));
		lists.add(new Job(4, "프로그래머"));
		
		return lists;
	}
	
	@ModelAttribute("specialist")
	public String[] specialist(){
		String[] array = {"마라톤", "중국어", "아랍어"};
		
		return array;
	}
	
	@RequestMapping(value = "/mycaller.hm", method = RequestMethod.GET)
	public ModelAndView doGet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("humanStart");
		//return null을 입력하면 메소드 이름인 doGet.jsp로 간다.
		return mav;
	}
	
	@RequestMapping(value = "/mycaller.hm", method = RequestMethod.POST)
	public ModelAndView doPost(
//			@RequestParam(value = "id",required = true) String id,
//			@RequestParam(value = "name",required = true) String name
			//request.getparameter 이런식으로 직접 처리하던 내용을 소괄호 안에서 처리
			//xxx = new Human(); 과 같음 
			//xxx는 지역변수로 이 함수 안에서만 처리가능하나 ,@ModelAttribute("human")는 jsp에서 커멘드객체이름 human으로 불러올수있다.
			@ModelAttribute("human") @Valid Human xxx,
			BindingResult errors) {
			//BindingResult 오류체크 오류가있으면.hasErrors()로 들어감 , @Valid 유효성 체크
		
		
		System.out.println(xxx.toString());
		
		ModelAndView mav = new ModelAndView("humanEnd");
		
		if(errors.hasErrors()) {//오류있음
			mav.setViewName("humanStart");
		}else {//오류없음
			mav.setViewName("humanEnd");
		}
		
//		System.out.println("폼 데이터 전송됨");	
//		System.out.println("id : "+id);
//		System.out.println("name : "+name);
		
		return mav;
	}
}