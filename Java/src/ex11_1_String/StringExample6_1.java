//���ڿ� ���� �޼ҵ�
/*
 * �ֹι�ȣ 123456-41234567�� �̿��Ͽ� ����,����,�ܱ����� ����ϱ�
 * ���ڸ� ù���ڰ� 1�Ǵ�3�̸� ����, 2�Ǵ�4�̸� ����, �� �ܴ� �ܱ���
 */
package ex11_1_String;

public class StringExample6_1 {
	public static void main(String[] args) {
		String str = "123456-41234567";

		String s = str.substring(7, 8);
		System.out.print("������ ���ڴ� " + s + "�̰� ");

		if(s.equals("1") || s.equals("3"))
			System.out.println("�����Դϴ�.");
		else if(s.equals("2") || s.equals("4") )
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�������Դϴ�.");
	}
}