package report_0404;

public class Saram_make2 {

	public static void main(String[] args) {
		//���1
		Saram father = new Saram("ȫ��ǥ", 75, 173, 57, "A");
		Saram mother = new Saram("������", 60, 162, 58, "B");
		Saram sister = new Saram("ȫ�ƶ�", 48, 164, 30, "AB");
		Saram hjw = new Saram("ȫ����", 68, 173.7, 27, "A");

		Saram[] family = new Saram[] { father, mother, sister, hjw };

		PrintSaram(family);
		
		//���2
		Saram[] family2 = new Saram[4];

		family2[0] = new Saram("ȫ��ǥ", 75, 173, 57, "A");
		family2[1] = new Saram("������", 60, 162, 58, "B");
		family2[2] = new Saram("ȫ�ƶ�", 48, 164, 30, "AB");
		family2[3] = new Saram("ȫ����", 68);

		family2[3].blood = "A";
		family2[3].ki = 173.7;
		family2[3].age = 27;
		
		PrintSaram(family2);
	}

	static void PrintSaram(Saram[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("�̸�:" + a[i].name);
			System.out.println("������:" + a[i].w + "kg");
			System.out.println("Ű:" + a[i].ki + "cm");
			System.out.println("����:" + a[i].age + "��");
			System.out.println("������:" + a[i].blood + "��");
			System.out.println();
		}
	}
}
