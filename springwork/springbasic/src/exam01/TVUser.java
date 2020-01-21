package exam01;

public class TVUser {
	public static void main(String[] args) {
		TVInterface Stv = new SamsungTV();
		Stv.powerOn();
		Stv.volumeUp();
		Stv.volumeDown();
		Stv.powerOff();
		
		TVInterface Ltv = new LgTV();
		Ltv.powerOn();
		Ltv.volumeUp();
		Ltv.volumeDown();
		Ltv.powerOff();
	}
}
