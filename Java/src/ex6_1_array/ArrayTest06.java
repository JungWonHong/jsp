package ex6_1_array;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		// String[] names = { "ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿" };
		// �Ʒ��� ���� �ǹ�
		String[] names = new String[] { "ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿" };

		Scanner sc = new Scanner(System.in);
		String input;
		int cnt = -1;

		System.out.println("�˻��� �̸��� �Է��ϼ���?");
		System.out.print("�̸�:");
		input = sc.next();

		for (int i = 0; i < names.length; i++) {
			if (input.equals(names[i]))
				cnt = i;
		}

		if (cnt == -1)
			System.out.println(input + "��(��) �迭�濡�� ã�� ���߽��ϴ�.");
		else
			System.out.println(input + "��(��) �迭�� [" + cnt + "]�濡�� ã�ҽ��ϴ�.");

		sc.close();
	}

}