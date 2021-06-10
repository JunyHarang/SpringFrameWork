package shape.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "shape/xmlconfig/applicationContext.xml";
		ApplicationContext context
			= new ClassPathXmlApplicationContext(configLocation);
		
		System.out.println(context);
		
		//객체가 잘생성되었는지 확인
		System.out.println("==========================");
		Circle circle1 = (Circle)context.getBean("circle");
		System.out.println(circle1);
		
		//하나의정보 확인
		Object mycircle = circle1.GetShapeOne();
		System.out.println(mycircle.toString());
		System.out.println("---------------------------");
		
		//여러개 정보 확인
		List<Object> mycirclelist = circle1.GetAllShapes();
		System.out.println("도형리스트");
		//원이 4개여서 확장for로 모든 도형을 구하기
		for(Object circle : mycirclelist) {
			System.out.println(circle.toString());
		}
		
		
		System.out.println("==========================");
		System.out.println("==========================");
		Rectangle shape2 = (Rectangle) context.getBean("rectangle");
		Object bean = shape2.GetShapeOne();
		System.out.println("사각형의 정보"+ bean.toString());
		System.out.println("---------------------------");
		
		System.out.println("사각형 리스트");
		List<Object> myrectanglelist = shape2.GetAllShapes();
		
		for(Object rect : myrectanglelist) {
			System.out.println(rect.toString());
		}
		
	}
}
