package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.AlbumDao;

@Controller
public class AlbumListController {
	@Autowired
	@Qualifier("dao")
	private AlbumDao albumDao;
	
	@RequestMapping(value = "/list.al")
	public ModelAndView xxxx() {
		String what = null;
		String keyword = null;
		
		//필드 겁색을 위한 맵
		Map<String, String> map = new HashMap<String,String>();
		
		//what이 null이거나 all이면 mapalbum.xml의 검색조건이 안되서 전체검색이됨
		//	<select id="getTotalCount" resultType="Integer"> 
		//	select count(*) from albums 이부분까지만 실행 됨
		if(what !=null && what.equals("all")) {
			what = null;
		}
		map.put("what", what);
		//%는 데이터베이스의 like연산자 때문에 사용ㅎ암.
		map.put("keyword","%" + keyword + "%");
		
		int totalCount = albumDao.GetTotalCount(map);
		System.out.println("totalCount : "+ totalCount);
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("alList");
		mav.addObject("totalCount", totalCount);
		
		return mav;
	}
}
