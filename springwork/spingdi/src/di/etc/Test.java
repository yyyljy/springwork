package di.etc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/etc.xml");
		CollectionTest etc1 = factory.getBean("collection", CollectionTest.class);
		etc1.getList();
		etc1.getMap();
		
		ContstructorTest etc2 = factory.getBean("con1", ContstructorTest.class);
		System.out.println(etc2);

		ContstructorTest etc3 = factory.getBean("con2", ContstructorTest.class);
		System.out.println(etc3);
		
		ContstructorTest etc4 = factory.getBean("con3", ContstructorTest.class);
		System.out.println(etc4);
	}
}
