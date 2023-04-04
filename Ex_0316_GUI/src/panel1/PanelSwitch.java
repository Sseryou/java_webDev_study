package panel1;

import javax.swing.JFrame;

import panel2.JPanel01;
import panel2.JPanel02;

public class PanelSwitch {
	public static void main(String[] args) {
		JPanelTest win = new JPanelTest();
		
		win.setTitle("frame Test");
		win.jpanel01 = new JPanel01(win);
		win.jpanel02 = new JPanel02(win);
		
		win.add(win.jpanel01);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setBounds(30,30,300,300);
		win.setVisible(true);
	}

}
