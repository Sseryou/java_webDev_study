package game2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
	
	JLabel jl1,jl2;
	JPanel jp;
	JButton jbHome,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9;
	Test t;
	
	public Panel02(Test t) {
		this.t = t;
		setLayout(null);
						
		jl1 = new JLabel("½ÇÇà½Ã°£ : ");
		jl1.setBounds(300, 10, 150, 20);
		jl2 = new JLabel("È½¼ö : ");
		jl2.setBounds(500, 10, 150, 20);		
		
		jp = new JPanel(); 
		jp.setBounds(10, 50, 965, 850);
		jp.setLayout(new GridLayout(4, 4, 20, 20));
		
		jbHome = new JButton("È¨À¸·Î");
		jbHome.setBounds(800, 10, 100, 30);
		
		jbHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t.change("panel01");
			}
		});
	
		img1 = new ImageIcon("src/images/´ß.png");
		img2 = new ImageIcon("src/images/µÅÁö.png");
		img3 = new ImageIcon("src/images/¸».png");
		img4 = new ImageIcon("src/images/¹ì.png");
		img5 = new ImageIcon("src/images/¼Ò.png");
		img6 = new ImageIcon("src/images/¿ë.png");
		img7 = new ImageIcon("src/images/Áã.png");
		img8 = new ImageIcon("src/images/È£¶ûÀÌ.png");
		img9 = new ImageIcon("src/images/yellow.png");
		
		jp.add(jb1 = new JButton(img9));
		jp.add(jb2 = new JButton(img9));
		jp.add(jb3 = new JButton(img9));
		jp.add(jb4 = new JButton(img9));
		jp.add(jb5 = new JButton(img9));
		jp.add(jb6 = new JButton(img9));
		jp.add(jb7 = new JButton(img9));
		jp.add(jb8 = new JButton(img9));
		jp.add(jb9 = new JButton(img9));
		jp.add(jb10 = new JButton(img9));
		jp.add(jb11 = new JButton(img9));
		jp.add(jb12 = new JButton(img9));
		jp.add(jb13 = new JButton(img9));
		jp.add(jb14 = new JButton(img9));
		jp.add(jb15 = new JButton(img9));
		jp.add(jb16 = new JButton(img9));
		
		
		add(jl1);
		add(jl2);
		add(jbHome);
		add(jp);
	
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jb1.setIcon(img1);

//				String prevImg = img1.getDescription();
////				Event_bt ev = new Event_bt();
////				String prevImg = ev.event_bt(jb1, img9);
//				System.out.println(prevImg);
			}
		});
//		Event_bt ev = new Event_bt();
		
//		String prevImg = ev.event_bt(jb1, img9);
//	
//		System.out.println(prevImg);
		
		
	}

}
