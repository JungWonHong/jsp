package ex5_3_while;

public class while01 {

	public static void main(String[] args) {
		// 1~10���� 1�� ����
		System.out.println("==1������==");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1; // i++;
		}

		// Ȧ�����
		System.out.println("==Ȧ�����==");
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		// ¦�����
		System.out.println("==¦�����==");
		i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		// 1~10������ ��
		System.out.println("==1~10������ ��==");
		int sum1 = 0;
		i = 1;
		while (i <= 10) {
			sum1 += i;
			i++;
		}

		System.out.println("1~10������ �� = " + sum1);

		// Ȧ�� �� ���ϱ�
		System.out.println("==Ȧ�� �� ���ϱ�==");
		int sum2 = 0;
		i = 1;
		while (i <= 10) {
			sum2 += i;
			i += 2;
		}

		System.out.println("1~10������ Ȧ���� �� = " + sum2);

		// ¦�� �� ���ϱ�
		System.out.println("==¦�� �� ���ϱ�==");
		int sum3 = 0;
		/*i = 1;
		while (i <= 10) {
			if (i % 2 == 0)
				sum3 += i;
			i++;
		}*/

		i = 2;
		while (i <= 10) {
			sum3 += i;
			i += 2;
		}

		System.out.println("1~10������ ¦���� �� = " + sum3);

	}

}