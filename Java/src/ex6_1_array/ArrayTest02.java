package ex6_1_array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� 5���� �Է��ϼ���?");

		int num[] = new int[5];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}

		avg = (double) sum / num.length; // ����ȯ ������Ѵ�. �����൵ ������ �ȶ����� 
										 // ������������ ����̹Ƿ� �� ��µȴ�.	
		System.out.println("�� = " + sum);
		System.out.println("��� = " + avg);

		sc.close();

	}

}