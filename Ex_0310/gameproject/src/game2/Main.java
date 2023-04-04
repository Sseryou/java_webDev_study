package game2;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.setTitle("이미지 짝 맞추기");
		t.panel01 = new Panel01(t);
		t.panel02 = new Panel02(t);
		
		t.add(t.panel01);
		t.setBounds(400, 50, 1000, 950);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setVisible(true);
	}
}
