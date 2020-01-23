package book.exam01.constructor;

public class SamsungTV implements TVInterface{
	Speaker speak;
	public SamsungTV(Speaker speak) {
		super();
		this.speak = speak;
	}

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		speak.volumeUp();
		System.out.println("SamsungTV---소리 올린다.");
	}

	public void volumeDown() {
		speak.volumeDown();
		System.out.println("SamsungTV---소리 내린다.");
	}
}
