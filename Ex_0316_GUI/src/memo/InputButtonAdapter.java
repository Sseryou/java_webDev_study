package memo;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{
	
	JTextArea ta;
	JTextField tf;
	JButton btn_input;
	
	public InputButtonAdapter(JTextArea ta, JTextField tf, JButton btn_input) {
		this.ta = ta;
		this.tf = tf;
		this.btn_input = btn_input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ư�� ������ � �ൿ�� �� ���ΰ�?
		
		//main���� �Լ� �޾ƿ���
		//1. �Լ��� �Ķ���ͷ� �����ֱ�
		//2. �������� �Ķ���ͷ� �����ֱ�
		
		//�����ڰ� �̹� �����Ƿ� ������ �Ķ���ͷ� �����ֱ�
		
		ta.append(tf.getText()+ "\n");
		tf.requestFocus(); //tf�� Ŀ���� �ű��.
		btn_input.setEnabled(false);//tf�� ������ ����ش�.
		
	}
	

}
