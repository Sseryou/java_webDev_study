package ex5_Check;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex3_ItemEvent {
	public static void main(String[] args) {
		//윈도우 버튼 -> windowListener
		//무언가를 클릭할때 반응 -> ActionListener
		//ItemListener
		JFrame f = new JFrame("ItemEvent예제");
		f.setLayout(new BorderLayout());
		
		//라디오버튼 객체 3개 생성하기
		JRadioButton jrb1 = new JRadioButton("선택1");
		JRadioButton jrb2 = new JRadioButton("선택2");
		JRadioButton jrb3 = new JRadioButton("선택3");
		
		//그룹에 라디오버튼 추가하기
		ButtonGroup jbg1 = new ButtonGroup();
		jbg1.add(jrb1);
		jbg1.add(jrb2);
		jbg1.add(jrb3);
		
		//패널 하나 만들어서 라디오버튼 붙이기
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		JLabel jl = new JLabel("선택 항목 : ");
		JLabel jl2 = new JLabel();
		jp2.add(jl);
		jp2.add(jl2);
		
		//프레임에 요소 붙이기
		f.add(jp1, BorderLayout.CENTER);
		f.add(jp2, BorderLayout.SOUTH);
		
		ItemListener il = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//아이템 상태가 바뀔때 호출됨
				if(e.getStateChange() == ItemEvent.SELECTED) {
					//StateChange = 지정되면 1, 지정이 풀리면 2를 반환
					//SELECTED = 상수 1
					if(e.getSource() == jrb1) {
						//getSource = 정보를 받아온다
						jl2.setText("선택1");
					} else if(e.getSource() == jrb2) {
						jl2.setText("선택2");
					}else if(e.getSource() == jrb3) {
						jl2.setText("선택3");
					}
				}
			}
		};
		
		jrb1.addItemListener(il);
		jrb2.addItemListener(il);
		jrb3.addItemListener(il);
		
		//기본 설정
		f.setBounds(300,300,300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
}
