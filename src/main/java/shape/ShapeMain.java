package shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "shape/shape.xml";
		ApplicationContext context
		= new ClassPathXmlApplicationContext(configLocation);
		Circle circle = (Circle) context.getBean("circle");
		System.out.println(circle.toString());
	}
}
