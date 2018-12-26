package ex8_07_final_method;
//���̳ʽ� ���� Ŭ����
// ��� ���� withdraw�޼ҵ带 �ٽ� ����(�޼ҵ� �������̵�)�ϴ� Ŭ����
public class CreditLineAccount extends Account {
	int creditLine; // ���̳ʽ� �ѵ� �ʿ�

	CreditLineAccount(String accountNo, String ownerName, 
						int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	//�޼ҵ� �������̵� - �����Ѵ� ��� �ٽ� ����.
	//Cannot override the final method from Account
	//�޼ҵ忡 final�� ������ �������̵� �ȵȴ�.
	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("������ �Ұ����մϴ�.");
		balance -= amount;
		return amount;
	}

}