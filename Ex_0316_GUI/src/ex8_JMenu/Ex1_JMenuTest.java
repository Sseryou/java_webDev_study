package ex8_JMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuTest");
		
		//메뉴 바 생성
		JMenuBar jmb = new JMenuBar();
		//메뉴 항목 생성
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("편집");
		JMenu jm3 = new JMenu("보기");
		
		//메뉴 아이템 생성
		JMenuItem jmi1 = new JMenuItem("새로만들기");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		
		//메뉴 아이템을 메뉴 항목과 결합
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		
		//메뉴 아이템 생성
		JMenuItem jmi4 = new JMenuItem("잘라내기");
		JMenuItem jmi5 = new JMenuItem("복사");
		JMenuItem jmi6 = new JMenuItem("붙혀넣기");
		
		//메뉴 아이템을 메뉴 항목과 결합
		jm2.add(jmi4);
		jm2.add(jmi5);
		jm2.add(jmi6);
		
		//메뉴 항목을 메뉴와 결합
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		//메뉴를 프레임과 결합
		f.setJMenuBar(jmb);
		
		
		
		f.setBounds(300,200,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
