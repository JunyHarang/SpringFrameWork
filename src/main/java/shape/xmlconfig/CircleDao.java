package shape.xmlconfig;

import java.util.ArrayList;
import java.util.List;


//실제로 데이터베이스와 연동으 수행하여 데이터를 가져오는 클래스 (현재 데이터베이스와 연동은 안되어 있음)
public class CircleDao implements ShapeDao{

	@Override
	public Object GetShapeOne() {
		// TODO Auto-generated method stub
		CircleBean bean = new CircleBean(3.0, 4.0, 5.0);
		return bean;
	}

	@Override
	public List<Object> GetAllShapes() {
		// TODO Auto-generated method stub
		List<Object> lists = new ArrayList<Object>();
		lists.add(new CircleBean(3.0, 4.0, 5.0));
		lists.add(new CircleBean(6.0, 5.0, 5.0));
		lists.add(new CircleBean(4.0, 6.0, 8.0));
		lists.add(new CircleBean(5.0, 7.0, 5.0));
		return lists;
	}
	
	
	
	

}
