package report_0405;

public class Wallet {
	// 필드
	static int money;
	String name;

	// 생성자
	Wallet(String name) {
		this.name = name;
	}
	
	// 돈을 넣는 메소드.
	void setMoney(int money) {
		Wallet.money += money;
	}

	// 돈을 꺼내는 메소드.
	void getMoney(int money) {
		Wallet.money -= money;
	}

}
