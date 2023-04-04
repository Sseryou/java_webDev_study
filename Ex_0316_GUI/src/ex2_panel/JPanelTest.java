package ex2_panel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	
	public JPanelTest() {
		super("FlowLayOut 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		//p1.setLayout(new FlowLayout());
		p1.setLayout(new GridLayout(3,3)); 
		//세로로 배치되는 요소개수, 가로로 배치되는 요소개수
		
		//배치관리자
		//FlowLayout: 왼쪽에서 오른쪽으로 배치, 오른쪽에 더이상 공간이 없으면 아래로 내려간다.
		//BorderLayout : 동,서,남,북,중앙 다섯개의 영역으로 나눈다.
		//GridLayout : N x N 의 표 모양으로 설정해주며 왼쪽에서 오른쪽, 위에서 아래로 설정해준다.
		//CardLayout : 요소를 포개어 배치
		//Null : 레이아웃을 쓰지 않고 각 컴포넌트마다 수동으로 위치를 설정
		
		//프레임이나 패널에 요소를 붙일 때 add()메서드를 사용한다.
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		p1.add(jb1);
		p1.add(jb2);
		p1.add(jb3);
		p1.add(jb4);
		p1.add(jb5);
		
		
		
		
		this.add(p1); //요소를 붙일때는 add를 사용
		
		setBounds(300,300,300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JPanelTest jt = new JPanelTest();
		jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 

}
