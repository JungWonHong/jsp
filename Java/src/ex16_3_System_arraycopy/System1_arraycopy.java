package ex16_3_System_arraycopy;

public class System1_arraycopy {

	public static void main(String[] args) {
		char arr1[] = { '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', 'ī', 'Ÿ', '��', '��' };
		char arr2[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
		
		// System.arraycopy(���� �迭, ���� �׸� ���� ��ġ, ���� ��� �迭, ���� ��� �׸� ���� ��ġ, ������ �׸��� ��);
		System.arraycopy(arr1, 10, arr2, 2, 3);
		// arr1[10]~arr1[12]�� ���� arr2[2]~arr2[4]�� ����

		for (char ch : arr2)
			System.out.print(ch + "  ");
	}

}