package Num6;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JS15012971E6 extends JFrame{
	JLabel label;
	JS15012971E6() {
		setTitle("¹®Á¦ 6¹ø");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("c");
		label.setSize(20,20);
		label.setLocation(100,100);
		label.addMouseListener(new MyMouseAdapter());
		
		add(label);
		setSize(300,300);
		setVisible(true);
		label.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971E6();
	}
	class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			int x = (int)(Math.random()*300);
			int y = (int)(Math.random()*300);
			label.setLocation(x,y);
		}
		
	}

}
