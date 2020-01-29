package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//Player가 갖고 있는 Dice를 외부에서(스프링컨테이너) Injection받아 사용해야 
//하므로 Injection받을 수 있도록 미리 준비해야 한다.
//==> Constuctor or Setter메소드
@Service("myplayer")
public class Player implements AbstractPlayer {
	@Autowired
	@Qualifier("dice2")
	AbstractDice d;
	int totalValue=0;
	public Player() {
		System.out.println("기본생성자...");
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}