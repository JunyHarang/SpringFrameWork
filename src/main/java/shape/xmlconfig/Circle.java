package shape.xmlconfig;

import java.util.List;

public class Circle implements Shape{
	//ShapeDao를 의존하고 있음(바로 CircleDao, RectangleDao를 불러오는것 보단 결합을 약하게 하기위해서 ShapeDao를 불러옴)
	private ShapeDao shapeDao; //default 값은 null
	
	public void setShapeDao(ShapeDao shapeDao) {
		this.shapeDao = shapeDao;
	}

	@Override
	public Object GetShapeOne() {
		// TODO Auto-generated method stub
		
		return this.shapeDao.GetShapeOne();
	}

	@Override
	public List<Object> GetAllShapes() {
		// TODO Auto-generated method stub
		
		return this.shapeDao.GetAllShapes();
	}

}
