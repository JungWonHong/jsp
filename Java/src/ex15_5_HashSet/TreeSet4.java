//�ڵ� ������ ���ִ� TreeSet�� �̿��� �ζǹ�ȣ 6�� ���ϱ�
package ex15_5_HashSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();

		while (set.size() < 6) {
			int num = (int) (Math.random() * 45 + 1);
			set.add(num);
		}

		System.out.println(set);

		// ���������� ���ϰ��� �ϸ� descendingSet()�޼��尡 �ʿ��ѵ�
		// 10����ó�� upcasting�� �ϸ� ����� �� �����ϴ�.
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		//������ �� �̹� �����ϱ� ������ �о�� �� ���� ������ �ʿ䰡 �����ϴ�.
		
		while (set2.size() < 6) {
			int num = (int) (Math.random() * 45 + 1);
			set2.add(num);
		}
		
		System.out.println(set2);
		//�������� �޼��� �����մϴ�.
		NavigableSet<Integer> desc = set2.descendingSet();
		//NavigableSet�� ������������ �Ȱ��� ������������, ������������ �Ȱ��� ������������ �Ҽ� �ִ�.
		System.out.println(desc);
		
		NavigableSet<Integer> desc2 = desc.descendingSet();
		System.out.println(desc2);
	}

}