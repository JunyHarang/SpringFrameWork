package shape.xmlconfig;

import java.util.List;

public interface Shape {
	public Object GetShapeOne(); //도형 1개의 정보 가져오기(상세보기 개념)
	public List<Object> GetAllShapes(); // 도형 여러개의 목록 정보 가져오기(목록 개념)
}
