package report_0403;

import java.util.Scanner;

public class Natural_sum {

	static void checkAndSum(int n1, int n2) {

		if (n1 > 0 && n2 > 0) {

			int sum = 0;

			if (n1 > n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;

				for (int i = n1; i <= n2; i++)
					sum += i;

			} else {
				for (int i = n1; i <= n2; i++)
					sum += i;
			}
			
			System.out.println("�Է¹��� �� ������ �� : " + sum);
			
		} else {
			
			System.out.println("�Է¹��� �� �߿� �ڿ����� �ƴ� ���� �ֽ��ϴ�.");
		
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("�� ���� �Է��ϼ���?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		checkAndSum(num1, num2);
		sc.close();

	}

}