package book.exam01.constructor;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("AppleSpeaker°´Ã¼ »ý¼º");
	}
	public void volumeUp() {
		System.out.println("AppleSpeakerÀÇ º¼·ý¾÷!!!");
	}
	public void volumeDown() {
		System.out.println("AppleSpeakerÀÇ º¼·ý´Ù¿î~~~");
	}
}
