package di.setter.basic;
public class InsaImpl implements Insa {
	//Constructor Injection으로 DAO객체를 주입받기 위해 필요
	MemberDAO dao;
	public InsaImpl() {
		System.out.println("InsaImpl 기본생성자");
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl 매개변수 1개 생성자");
	}
	//setter Injection으로 MemberDAO객체를 주입받기위해 setter메소드를 준비
	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("준비");
		this.dao = dao;
	}
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}
	
}
