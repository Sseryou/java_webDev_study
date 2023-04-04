package memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoMain {
	public static void main(String[] args) {
		//메모장 만들기
		JFrame frame = new JFrame("메모장");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayout(null);//수동배치
		
		//글자 입력칸 만들기
		JTextField tf = new JTextField();
		tf.setBounds(7,15,180,30);
		
		//확인 버튼 만들기
		JButton btn_input= new JButton("확인");
		btn_input.setBounds(190, 15, 60, 30);
		btn_input.setEnabled(false);
		
		//글자 표시 영역 만들기
		JTextArea ta = new JTextArea();
		ta.setBounds(7,50,242,200);
		ta.setEditable(false);
		
		//저장, 종료버튼 만들기
		JButton btnSave = new JButton("저장");
		JButton btnClose = new JButton("종료");
		btnSave.setBounds(10,260,110,30);
		btnClose.setBounds(130,260,110,30);
		
		//프레임에 요소 붙이기
		frame.add(tf);
		frame.add(btn_input);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		//요소에 기능 붙이기
		//tf의 정보를 받아와 확인버튼의 활성화 비활성화 결정
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(tf.getText().length() == 0) {
					//tf에 아무것도 쓰여있지 않으면 버튼 비활성화
					btn_input.setEnabled(false);
				}else {
					btn_input.setEnabled(true);
				}
				
			}
		});
		
		//확인 버튼 클릭시 tf의 값을 ta로 복사해서 넣어주기
		btn_input.addActionListener(new InputButtonAdapter(ta,tf,btn_input));
		
		
		
		
		//btnClose를 눌렀을때 프로그램 종료
		btnClose.addActionListener(new ActionListener() {
			//addActionListener를 이용해 클릭됐다는 정보를 받음
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); //프레임 종료
			}
			
		});
		
		//btnSave를 눌렀을때 ta에 있는 값을 메모장으로 저장하는 기능 구현
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta에 써있는 내용을 가져와야 한다.
				String msg = ta.getText();
				//경로 지정
				FileDialog fd = new FileDialog(frame,"저장",FileDialog.SAVE);
				fd.setVisible(true);
				//fd를 통해 지정한 저장경로와 파일명을 알아내자.
				String path = fd.getDirectory() + fd.getFile(); 
				//+.txt를 붙이면 확장자를 붙이지 않아도 되지만, 확장자가 .txt로 고정된다.
				
				//System.out.println(path);
				
				//char기반의 스트림을 생성하여 path경로에 저장
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(msg);
					fw.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		//초기 설정
		frame.setBounds(700,200,270,350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
