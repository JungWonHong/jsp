package ex7_05_default_contructor;

public class ConstrExample3 {

	public static void main(String[] args) {
		SubscriberInfo obj;
		obj = new SubscriberInfo(); 
		//The constructor SubscriberInfo() is undefined
		obj.name = "이영재쌉고수";
		obj.address = "기흥구청쌉고수";
		obj.id = "SsapGoSu";
		obj.password = "ssapssapgosu";
		obj.phoneNo = "112";
		printSubscriberInfo(obj);
	}

	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();
	}
}
