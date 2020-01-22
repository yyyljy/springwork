package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanTest2 {
	public static void main(String[] args) {
		//1. xml파싱
		Resource res = new ClassPathResource("/config/bean.xml");
		//2.컨테이너객체를 생성
		BeanFactory factory = new XmlBeanFactory(res);
		//3. 컨테이너가 관리하는 객체를 전달받기
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean");
		//비지니스 로직 호출
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("111111111111111111");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("111111111111111111");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("22222222222222222");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("22222222222222222");
	}

}
