package book.exam01.constructor;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("AppleSpeaker��ü ����");
	}
	public void volumeUp() {
		System.out.println("AppleSpeaker�� ������!!!");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker�� �����ٿ�~~~");
	}
}
