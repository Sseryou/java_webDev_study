package panel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import panel1.JPanelTest;


public class JPanel01 extends JPanel{
	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JPanelTest win;
	
	public JPanel01(JPanelTest win) { 
		this.win = win;
		setLayout(null);
		
		jButton1 = new JButton("버튼");
		jButton1.setBounds(10,10,70,20);
		add(jButton1);
		
		jTextArea1 = new JTextArea();
		jScrollPane1 = new JScrollPane(jTextArea1);
		jScrollPane1.setBounds(10,40,200,150);
		add(jScrollPane1);
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("jpanel02"); //버튼을 눌렀을때 패널 바꾸기
				
			}
		});
	}

}
