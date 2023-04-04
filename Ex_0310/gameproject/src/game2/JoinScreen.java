package game2;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class JoinScreen extends JFrame {

	String choice = null;
	
	public JoinScreen() {
		
		setTitle("회원가입");
		
		
		JLabel title = 
			new JLabel("회원가입", JLabel.CENTER);
		
		title.setForeground(new Color(5, 0, 153));
		
		JButton join = new JButton("회원가입");
		JButton cancel = new JButton("취소");
		
		JTextField id = new JTextField(10);
		JPasswordField pwd = new JPasswordField(10);
		JTextField name = new JTextField(10);
		
		
		
		
		// form panel
		JPanel idP = new JPanel();
		idP.setLayout(new FlowLayout(FlowLayout.RIGHT));
		idP.add(new JLabel("아이디 : "));
		idP.add(id);
		
		
		JPanel pwdP = new JPanel();
		pwdP.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pwdP.add(new JLabel("비밀번호 : "));
		pwdP.add(pwd);
		
		
		JPanel nameP = new JPanel();
		nameP.setLayout(new FlowLayout(FlowLayout.RIGHT));
		nameP.add(new JLabel("닉네임 : "));
		nameP.add(name);
		
		
		
		JPanel f = new JPanel();
		f.setLayout(new GridLayout(4, 1));
		f.add(idP);
		f.add(pwdP);
		f.add(nameP);
		
		
		
		JPanel ct = new JPanel();
		ct.setLayout(new FlowLayout());
		ct.add(f);
		
		
		JPanel panel = new JPanel();
		panel.add(join);
		panel.add(cancel);
		
		
		add(title, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
		
		setBounds(200, 200, 250, 300);
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		// 이벤트 처리
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String myId = id.getText();
				String myPwd = new String(pwd.getPassword());
				String myName = name.getText();
				
				
				
				JOptionPane.showMessageDialog
					(null, "아이디 : "+myId+", 비밀번호 : "+myPwd+", 이 름 : "+myName);
			}
		});
		
		
		// 취소 버튼을 클릭했을 때 이벤트 처리
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new LoginScreen();
				dispose();
				
			}
		});
	}
}
	
	
	


