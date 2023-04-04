package ex4_Button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1_JButton {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton jb1,jb2,jb3;
		
		f.setLayout(new FlowLayout());
		
		//JButton : Ŭ������� �����ϴ� ���
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		
		//�����ӿ� ��� ���̱�
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		
		//�̺�Ʈ�� �̺�Ʈ ó��
		//�̺�Ʈ�� ������� �Է�, Ű���峪 ���콺�� Ŭ������ �߻��ϴ� ��� ���
		//�ڹٿ����� �޼���� �����Ǿ�, �̺�Ʈ�� ���ۿ� �����ϴ� �������
		//ó���� �ȴ�.
		//�޼��� -> �������̽� -> ~Listener
		
		
		//���밨����
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ư�� ���������� ȣ��Ǵ� �޼���
				//getActionCommand() : ��ư�� �����ִ� ���ڿ��� �о�´�.
				//��ȯ�� String
				switch(e.getActionCommand()) {
				case "1":
					System.out.println("1�� ��ư����");
					break;
				case "2":
					System.out.println("2�� ��ư����");
					break;
				case "3":
					System.out.println("3�� ��ư����");
					break;
					
				};
				
			}
		};
		
		//��ư�� ��� ������
		jb1.addActionListener(al);
		jb2.addActionListener(al);
		jb3.addActionListener(al);
		
		
		

		f.setBounds(400,400,295,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}
