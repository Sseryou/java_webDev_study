package game2;

import javax.swing.JFrame;

public class Test extends JFrame {
	Panel01 panel01;
	Panel02 panel02;
	
	public void change(String panelName) {
		if(panelName.equals("panel01")) {
			getContentPane().removeAll();
			getContentPane().add(panel01);
			revalidate(); //
			repaint(); //새로고침
		} else {
			getContentPane().removeAll();
			getContentPane().add(panel02);
			revalidate();
			repaint();
		}
	}
}
