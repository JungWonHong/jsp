package ex8_16_interface_constant;

public interface Lendable {
	final static byte STATE_BORROWED = 1;	// 대출 중
	final static byte STATE_NORMAL = 0;		// 대출되지 않은 상태
	
	//public abstract 생략가능(알아서 붙여줌)
	void checkOut(String borrower, String date); // 대출한다.
	
	void checkIn(); // 반납한다.
}
