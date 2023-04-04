package ex3_text;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame("JText 예제");
		
		f.setBounds(400,400,295,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		f.setLayout(new FlowLayout());
		
		//JLable : 프레임에 글씨를 새긴다
		JLabel lb1 = new JLabel("이름");
		JLabel lb2 = new JLabel("주소");
		JLabel lb3 = new JLabel("번호");
		lb1.setBackground(Color.YELLOW);
		
		//JTextField : 한 줄을 키보드에서 입력할 수 있는 공간
		JTextField jf = new JTextField(20);
		
		//JTextArea : 여러 줄을 입력할 수 있는 공간
		JTextArea ja = new JTextArea(7,20);
		ja.setBackground(Color.YELLOW);
		
		//JPassWordField : 입력받은 글자를 보여주지 않는 요소
		JPasswordField pf = new JPasswordField(20);
		
		//요소 프레임에 추가하기
		f.add(lb1);
		f.add(jf);
		f.add(lb2);
		f.add(ja);
		f.add(lb3);
		f.add(pf);
		
		
	}
	
}
