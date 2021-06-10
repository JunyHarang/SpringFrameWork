package shape.xmlconfig;

import java.util.ArrayList;
import java.util.List;

//실제로 데이터베이스와 연동으 수행하여 데이터를 가져오는 클래스 (현재 데이터베이스와 연동은 안되어 있음)
public class RectangleDao implements ShapeDao{

	@Override
	public Object GetShapeOne() {
		// TODO Auto-generated method stub
		RectangleBean bean = new RectangleBean(3.0, 4.0);
		return bean;
	}

	@Override
	public List<Object> GetAllShapes() {
		// TODO Auto-generated method stub
		List<Object> lists = new ArrayList<Object>();
		lists.add(new RectangleBean(3.0, 4.0));
		lists.add(new RectangleBean(6.0, 5.0));
		return lists;
	}
	
	

}
