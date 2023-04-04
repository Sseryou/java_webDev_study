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
		//버튼이 눌리면 어떤 행동을 할 것인가?
		
		//main에서 함수 받아오기
		//1. 함수의 파라미터로 보내주기
		//2. 생성자의 파라미터로 보내주기
		
		//생성자가 이미 있으므로 생성자 파라미터로 보내주기
		
		ta.append(tf.getText()+ "\n");
		tf.requestFocus(); //tf로 커서를 옮긴다.
		btn_input.setEnabled(false);//tf의 내용을 비워준다.
		
	}
	

}
