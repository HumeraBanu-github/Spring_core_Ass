package springs.ques6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.springcore.Student;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Driver.xml");
		context.registerShutdownHook();
	    Driver obj =(Driver) context.getBean("driver");
	     obj.disp();
	}

}
