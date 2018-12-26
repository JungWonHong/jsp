package baekjoon;

import java.util.Scanner;

public class Main_cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �Է°�
		int result; // �����
		int cycle = 0;
		int x, y, z; // x�� �ռ����� ù��°, y�� �ι�°, z�� ������ ���

		if (N < 10) {
			N = (N * 10) + N;
		}
		
		result = N;
		
		while (true) {
			x = result / 10;
			y = result % 10;
			z = x + y;
			result = (y * 10) + (z % 10);

			cycle++;
			if (result == N)
				break;
		}

		System.out.print(cycle);
		sc.close();
	}

}