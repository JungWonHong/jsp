package ex18_10_File;

import java.io.*;

public class FileExample2_3 {

	public static void main(String[] args) {
		String dir = "E:\\newDirectory\\newFile.txt";
		//���� ����
		File f3 = new File(dir);
		if(f3.exists()){
			System.out.println(f3.getPath() + "�����߽��ϴ�.");
			f3.delete(); //���� ����
		}else{
			System.out.println(f3.getPath() + "�� �����ϰ��� �ϴ� ������ �����ϴ�.");
		}
		
		//���丮 ����
		File f4 = new File("E:\\newDirectory");
		if(f4.exists()){
			System.out.println(f4.getPath() + "�����߽��ϴ�.");
			f4.delete();
		}else{
			System.out.println(f4.getPath() + "�� �����ϰ��� �ϴ� ���丮�� �����ϴ�.");
		}
	}

}