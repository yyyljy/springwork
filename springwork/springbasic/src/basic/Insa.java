package basic;
public interface Insa {
	void addUser(MemberDTO user);
	MemberDTO getUser(String id);
	public void setDao(MemberDAO dao);
}

