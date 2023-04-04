package game2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel01 extends JPanel {
	
	JLabel jl,jlname;
	JTextField tf;
	JButton jbStart,jbEnd,jbRank;
	Test t;
	
	public Panel01(Test t) {
		this.t = t;
		setLayout(null);
		
		jl = new JLabel("이미지 짝맞추기");
		jl.setBounds(450, 250, 150, 30);
		
		jlname = new JLabel("닉네임 : ");
		jlname.setBounds(400, 500, 150, 50);
		
		tf = new JTextField(20); 
		tf.setBounds(460, 510, 150, 30);
		
		jbStart = new JButton("게임 시작");
		jbStart.setBounds(430, 550, 150, 30);
		jbEnd = new JButton("게임 종료");
		jbEnd.setBounds(430, 600, 150, 30);
		jbRank = new JButton("로그인");
		jbRank.setBounds(430, 650, 150, 30);

		add(jl);
		add(jlname);
		add(tf);
		add(jbStart);
		add(jbEnd);
		add(jbRank);
		
		jbStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t.change("panel02");
			}
		});
		
		jbEnd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		jbRank.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginScreen();
				
			}
		});
		
	}
	
}
