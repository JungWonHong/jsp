package ex6_1_array;

import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		int max, min;
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 5개를 입력하세요?");
		
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}

		max = data[0];
		min = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max <= data[i])
				max = data[i];

			if (min >= data[i])
				min = data[i];
		}
		
		/*
		data[0] = sc.nextInt();
		int max = data[0], min = data[0];
		for(int i = 1; i < data.length; i++){
			data[i] = sc.nextInt();
			if(max < data[i]) max = data[i];
			if(min > data[i]) min = data[i];
		}
		*/

		System.out.println("max = " + max + "\nmin = " + min);
		
		sc.close();
	}
}
