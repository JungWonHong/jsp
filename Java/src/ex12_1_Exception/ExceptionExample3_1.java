//checked exception�� ������ �޼ҵ�
//������ ���� �߻� - �޼ҵ带 ȣ���� ������ try-catch���� ������ ���� �߻�
//throw new Exception�� �߻���Ų ������ throws �� �����ؾ߸� ��
package ex12_1_Exception;

public class ExceptionExample3_1 {

	public static void main(String[] args) {
		try {
			int result = add(1, -2);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("���� �߻�");
		}

	}

	static int add(int a, int b) {
		int result = a + b;
		if (result < 0)
			throw new Exception("���� �߻�");
		return result;
	}
}