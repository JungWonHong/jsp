package report_0330;

import java.util.Scanner;

public class Search_name {

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
			if (input.equals(names[i])){
				cnt = i;
				//break;
			}
		}

		if (cnt == -1)
			System.out.println(input + "��(��) �迭�濡�� ã�� ���߽��ϴ�.");
		else
			System.out.println(input + "��(��) �迭�� [" + cnt + "]�濡�� ã�ҽ��ϴ�.");

		sc.close();
	}

}