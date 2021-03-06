package baekjoon;

import java.util.Scanner;

public class Main_sugar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력된 설탕의 무게
		int bag = 0; // 최소 가방의 수

		if (N >= 3 && N <= 5000) {
			if (N % 5 == 0) { // 5의 배수
				bag = N / 5;
				System.out.println(bag);
			} else if (N % 5 != 0 && N % 3 == 0) { //
				int i = 1;
				while (((N - 3 * i) % 5 != 0)) {
					i++;
				}
				bag = i + ((N - 3 * i) / 5);
				System.out.println(bag);
			} else if (N % 5 != 0 && N % 3 != 0) {

				for (int i = 1; i < (N / 3); i++) {
					if ((N - 3 * i) % 5 == 0) {
						bag += i;
						break;
					}
				}
				if (bag != 0) { // 8의 배수인 경우
					bag = bag + ((N - 3 * bag) / 5);
					System.out.println(bag);
				} else if (bag == 0)
					System.out.println(-1);
			}

		}

		else
			System.out.println("조건이 맞지 않습니다.");
		
		sc.close();

	}

}
