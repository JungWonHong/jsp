package ex15_5_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2_Generics_lotto {

	public static void main(String[] args) {
		// HashSet ��ü ����
		HashSet<Integer> set = new HashSet<Integer>();

		// HashSet�� �ߺ��� ������� �ʱ� ������ �ߺ� üũ ���� �����൵�ȴ�.
		while (set.size() < 6) {
			set.add((int) (Math.random() * 45 + 1));
		}

		// set ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println(set);

		/*int[] sortNum = sort(set);
		for (int i = 0; i < sortNum.length; i++)
			System.out.print(sortNum[i] + "\t");*/
	}

	/*static int[] sort(HashSet<Integer> set) {
		Iterator<Integer> iterator = set.iterator();
		int[] data = new int[set.size()];
		int k = 0;
		while (iterator.hasNext()) {
			data[k] = iterator.next();
			k++;
		}

		int imsi;
		for (int i = 0; i < set.size() - 1; i++) {
			for (int j = i + 1; j < set.size(); j++) {
				if (data[i] > data[j]) {
					imsi = data[i];
					data[i] = data[j];
					data[j] = imsi;
				}
			}
		}

		return data;
	}*/

}