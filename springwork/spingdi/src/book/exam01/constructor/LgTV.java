package book.exam01.constructor;

public class LgTV implements TVInterface{
	Speaker speak;
	public LgTV(Speaker speak) {
		super();
		this.speak = speak;
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		speak.volumeUp();
		System.out.println("LgTV---소리 올린다.");
	}

	public void volumeDown() {
		speak.volumeDown();
		System.out.println("LgTV---소리 내린다.");
	}
}
