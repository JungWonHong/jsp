package baekjoon;
import java.util.Scanner;

public class Main_dup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트케이스수
		String[] S_new = new String[T];
		for(int i=0;i<T;i++)
			S_new[i] = "";
		
		for(int i=0;i<T;i++){
			int R = sc.nextInt();
			String S = sc.next();
			for(int j=0;j<S.length();j++){
				for(int k=0;k<R;k++)
					S_new[i] += S.charAt(j);
			}
		}
		
		for(int i=0;i<S_new.length;i++)
			System.out.println(S_new[i]);
		
		sc.close();
	}
}
