package ex7_11_method_exception;

//Numbers2 Ŭ������ ����ϴ� ���α׷�
class MethodExample3 {

	public static void main(String[] args) {

		int arr[] = new int[0]; // ���̰� 0�� �迭�� ����
		Numbers obj = new Numbers(arr);
		int average = obj.getAverage();// �� �޼ҵ� �ȿ��� �ͼ����� �߻�
		// 0���� ������ ���� ������ �����߻�.
		System.out.println("��� = " + average);

	}

}