package ex3_4_casting;

public class CastingEx3 {

	public static void main(String[] args) {
		
		//int -> char
		int i3 = 97;
		char c1 = (char)i3;
		System.out.println("i3����Ÿ�� " + i3 + "�Դϴ�.");
		System.out.println("c1����Ÿ�� " + c1 + "�Դϴ�.");
		
		i3 = 65;
		c1 = (char)i3;
		System.out.println("i3����Ÿ�� " + i3 + "�Դϴ�.");
		System.out.println("c1����Ÿ�� " + c1 + "�Դϴ�.");
		
		//�ƽ�Ű �ڵ�(ASCII CODE) - ��ǻ�Ϳ��� ǥ���ϴ� ���ڸ� 0~127�� ������Ų �ڵ�
		System.out.printf("%c\n", 'A'); //���� 'A'�� ���� ���� (%c)���� ���
		System.out.printf("�ƽ�Ű�ڵ� 65�� ���� %c�� �ǹ��մϴ�.\n", 65); //����65�� ���� ���� (%c)���� ����ض�
		System.out.printf("���� A�� �ƽ�Ű �ڵ�� %d�Դϴ�.\n", (int)'A'); //���� 'A'�� ���� ���� (%d)���� ����ض�
	}

}