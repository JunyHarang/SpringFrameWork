package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bean.Album;
import utility.Paging;

@Component("dao")
public class AlbumDao {	
	// mapper 파일의 네임 스페이스 이름과 동일해야 합니다.
	//mapalbum.xml의 mapper namespace="MyAlbum"
	private final String namespace = "MyAlbum" ;

	// 이 메소드를 스프링 설정 파일에서 setter injection 시키고 있다.
	@Autowired
	SqlSessionTemplate abcd;
	
//	@Autowired //AlbumMapper 인터페이스 
//	AlbumMapper mapper;	
	
	public int GetTotalCount(Map<String, String> map) {
		int cnt = -1;
		cnt = this.abcd.selectOne(namespace + ".getTotalCount", map);
		return cnt;
	}

	public List<Album> getAlbumList( Paging pageInfo,  Map<String, String> map ) {
		System.out.println(this.getClass() + ".getAlbumList 들어옴");
		List<Album> lists = new ArrayList<Album>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit() );
		lists = this.abcd.selectList(namespace + ".getAlbumList", map, rowBounds);
		return lists;
	}  
}
