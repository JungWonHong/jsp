package ex9_12_enum;

public class EnumExample3 {

	public static void main(String[] args) {
		//�������� ����ϸ� �ʱ�ȭ�� �ȴ�. �� ���Ű����� ������ ȣ��. ���� �� ���Ű����� �����ڰ� ȣ��Ǵ°� �����ִ�.
		printSeason(Season.SPRING); //������ SPRING�� �ּҸ� �Ѱ��ش�.
		printSeason(Season.FALL);
	}

	static void printSeason(Season season) {
		System.out.println();

		// �־��� ���� ����� ¦�� �̷� ���� ����
		
		System.out.println("season.value() = " + season.value());

		/*
		 * ��� �������� ������ java.lang.EnumŬ������ ���ǵ� �޼��� 1. String name() - ������ ����� �̸���
		 * ���ڿ��� ��ȯ�Ѵ�. 2. int ordinal() - ������ ����� ���ǵ� ������ ��ȯ�Ѵ�(0���� ����)
		 */
		System.out.println("season.name() = " + season.name());
		
		System.out.println("season.ordinal() = " + season.ordinal());
	}

}