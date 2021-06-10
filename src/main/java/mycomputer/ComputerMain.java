package mycomputer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerMain {
	public static void main(String[] args) {
		String configLocation = "mycomputer/computer.xml";
		
		//context가 computer.xml 파일자체가 된다고 생각하면 된다. 
		ApplicationContext context 
		= new ClassPathXmlApplicationContext(configLocation);
		
		//object 이기 떄문에 강등처리
		Programer soo = (Programer)context.getBean("programer");
		
		System.out.println(soo.toString());
	}
}
