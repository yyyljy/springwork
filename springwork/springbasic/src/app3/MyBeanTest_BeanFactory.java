package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory(컨테이너)가 객체를 관리하는 방법 - 언제 객체를 생성할까?
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("****Resource 생성 전****");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("****BeanFactory 생성 전****");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("****getBean 호출 전****");
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj1==obj2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//비지니스 로직 호출
		run(obj1);
		show(obj1);
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
