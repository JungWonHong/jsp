package report_0405;

public class Wallet {
	// �ʵ�
	static int money;
	String name;

	// ������
	Wallet(String name) {
		this.name = name;
	}
	
	// ���� �ִ� �޼ҵ�.
	void setMoney(int money) {
		Wallet.money += money;
	}

	// ���� ������ �޼ҵ�.
	void getMoney(int money) {
		Wallet.money -= money;
	}

}