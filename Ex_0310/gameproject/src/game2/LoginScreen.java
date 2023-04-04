package game2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {
	
	
	
	

	public LoginScreen() {
		
		setTitle("로그인");
		
		JPanel title = new JPanel();
		
		
		JLabel login = new JLabel("로그인 ");
		
		login.setForeground(new Color(5, 0, 153));
		
		title.add(login);
		
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(3, 2));
		
		JPanel idP = 
			new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlb1 = new JLabel("아이디 : ", JLabel.CENTER);
		
		idP.add(jlb1);
		
		JPanel idP2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf1 = new JTextField(10);
			
		idP2.add(jtf1);
		
		jp1.add(idP); jp1.add(idP2);
		
		
		JPanel pwdP = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlb2 = new JLabel("비밀번호 : ", JLabel.CENTER);
		
		JPanel pwdP2 = 
				new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPasswordField jtf2 = new JPasswordField(10);
		
		pwdP.add(jlb2); pwdP2.add(jtf2);
		
		jp1.add(pwdP); jp1.add(pwdP2);
		
		
		JPanel log = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton jL = new JButton("로그인");
		
		JPanel join1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton join = new JButton("회원가입");
		
		log.add(jL); join1.add(join);
		
		jp1.add(log); jp1.add(join1);
		
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(jp1);
		
		setLayout(new BorderLayout());
		
		add(title, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		
		setBounds(200, 200, 300, 250);
		
		setResizable(false);  
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		// 이벤트 처리
		jL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String myId = jtf1.getText();
				String myPwd = new String(jtf2.getPassword());
				
				JOptionPane.showMessageDialog
					(null, "아이디 : "+myId+", 비밀번호 : "+myPwd);
					dispose();
			}
		});
		
		
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new JoinScreen();
				dispose();  
				
			}
		});

//		this.addWindowListener(new WindowListener);
	}
}
