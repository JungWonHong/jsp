//������� �۵��ϴ� Hello, Java ���α׷�
//�����ϸ� ����ȭ�� ���� ��ܿ� �����찡 ��Ÿ���ϴ�.
//�����ư Ŭ���� ������� ��������� ���α׷��� ������� �ʽ��ϴ�. - ������ �κ�
//���� ����� consoleâ���� ���� ��ư Ŭ��
package ex21_1_JFrame1;
import java.awt.*;
import javax.swing.*;
public class WindowExample1 {

	public static void main(String[] args) {
		//Ÿ��Ʋ�� �ִ� ������ �����մϴ�.
		JFrame frame = new JFrame("�̰��� Ÿ��Ʋ �� �Դϴ�.");
		//Ÿ��Ʋ ���� ������ �����մϴ�.
		//JFrame frame = new JFrame();
		
		//���� �����ϴ� ���Դϴ�.
		JLabel label = new JLabel("Hello, Java");
		
		//�������� �ִ� content pane�� �����ɴϴ�.
		//Container�� java.awt��Ű���� ���ϴ� Ŭ���� �̸��Դϴ�.
		Container contentPane = frame.getContentPane();
		
		//���� content pane���� �÷������ϴ�.
		contentPane.add(label);
		
		//�������� ���÷��̸� �ϸ� �� ���� �ִ� ������Ʈ�鵵 �ڵ����� ���÷��� �˴ϴ�.
		//�����ӿ� �����ִ� ������Ʈ���� ũ�⿡ �°� �������� ũ�⸦ �����մϴ�.
		//�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		frame.pack();
		
		//�������� ���÷����մϴ�.
		frame.setVisible(true);
	}

}