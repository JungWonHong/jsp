package ex7_05_default_contructor;

public class SubscriberInfo {
	String name, id, password;
	String phoneNo, address;

	//�Ű� ���� ���� ������ �߰�
	//�ڹ������Ϸ��� Ŭ������ ����� �����ڰ� �ϳ��� ������
	//������ �����ڸ� �߰����� �ʽ��ϴ�.
	SubscriberInfo(){} // �����ڰ� ���ǵǾ������� ����Ʈ�����ڵ� ���� ����������Ѵ�.
	
	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	void changePassword(String password) {
		this.password = password;
	}

	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	void setAddress(String address) {
		this.address = address;
	}

}