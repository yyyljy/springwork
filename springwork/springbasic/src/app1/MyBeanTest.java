package app1;
/*
 * 결합도가 극도로 높은 프로그램
 * => 클래스간 결합도가 강하고, 의존성이 높다.
 * => 사용되는 클래스를 변경하면 해당 클래스를 사용하고 있는 모든 소스를 수정해야된다.
 * 		즉, 수정해야되는 범위가 넓다.
 * 		oop특성도 적용되어 있지 않다.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("******************");
		obj.testHello("현빈");
		obj.testHello("현빈");
		System.out.println("******************");
	}
	public static void show(MyBeanStyleA obj) {
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		obj.testHello("현빈");
		obj.testHello("현빈");
		System.out.println("^^^^^^^^^^^^^^^^^^^");
	}
}
