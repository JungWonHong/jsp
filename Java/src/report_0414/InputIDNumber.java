//���ڿ� ���� �޼ҵ�
/* StringExample6_1.java�� ������ ���ô�.
 * 1. �ֹε�Ϲ�ȣ�� �Է¹޽��ϴ�.
   2. "e"�� �Է¹����� �Է¹޴� �ݺ��� �����ϴ�.
   3. �Է¹��� �ֹε�Ϲ�ȣ�� 14������ �Ǻ��ϴ� �޼��带 �ۼ��մϴ�.
      14���� �ƴϸ� "�ֹε�Ϲ�ȣ�� 14�ڸ��Դϴ�."��� �޽����� ����ϰ�
              �ٽ� �Է� �޵��� �մϴ�.
*/
package report_0414;

import java.util.Scanner;

public class InputIDNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�ֹε�Ϲ�ȣ �Է�(e�Է½�����)>>");
			String IDNum = sc.nextLine();
			if(IDNum.equals("e"))
				break;
			
			if(!distinctIDNum(IDNum)){
				System.out.println("�ֹε�Ϲ�ȣ�� 14�ڸ��Դϴ�.\n�ٽ� �Է����ּ���.");
				continue;
			}
			
			String s = IDNum.substring(7, 8);

			if(s.equals("1") || s.equals("3"))
				System.out.println("�����Դϴ�.");
			else if(s.equals("2") || s.equals("4") )
				System.out.println("�����Դϴ�.");
			else
				System.out.println("�ܱ����Դϴ�.");
			
		}
		
		System.out.print("��");
		
		sc.close();

	}

	static boolean distinctIDNum(String IDNum) {
		if (IDNum.length() == 14)
			return true;
		else
			return false;
	}
}