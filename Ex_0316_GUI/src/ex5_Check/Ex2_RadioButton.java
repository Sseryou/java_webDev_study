package ex5_Check;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ex2_RadioButton {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		//������ư : �ߺ����� �� �� ���°�
		//����, ����  	�̰�, ����
		
		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("����", true);
		JRadioButton jrb2 = new JRadioButton("����");
		
		//��ư �׷쿡 ������ư �߰�
		bg1.add(jrb1);
		bg1.add(jrb2);
		
		//�����ӿ� ��� �߰��ϱ�
		f.add(jrb1);
		f.add(jrb2);
		
		f.setBounds(400,400,295,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
	}

}
