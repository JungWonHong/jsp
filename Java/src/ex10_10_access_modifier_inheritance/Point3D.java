// protected �޼ҵ带 �߸� �������̵��ϴ� Ŭ����
package ex10_10_access_modifier_inheritance;

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	int getX() { // �߸��� �޼ҵ�
		return x;
	}

	int getY() { // �߸��� �޼ҵ�
		return y;
	}
	
	int getZ() {
		return z;
	}
}