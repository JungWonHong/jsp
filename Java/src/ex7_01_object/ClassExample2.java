package ex7_01_object;

public class ClassExample2 {

	public static void main(String[] args) {
		GoodsStock2 obj;				//���� ����
		obj = new GoodsStock2();		//��ü ����
		obj.goodsCode = "52135";	//�ʵ忡 ���� ����
		obj.stockNum = 200;			//�ʵ忡 ���� ����

		System.out.println("��ǰ�ڵ�:" + obj.goodsCode); //�ʵ� �� ���
		System.out.println("�������:" + obj.stockNum);

		obj.addStock(1000);	//�޼��� ȣ��

		System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		System.out.println("�������:" + obj.stockNum);
	}

}