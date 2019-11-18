package Num4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JS15012971E4 extends JFrame{
	JLabel label;
	String text = "Love Java";
	JS15012971E4() {
		setTitle("¹®Á¦ 4¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
//		Container c = getContentPane();
		label = new JLabel("Love Java");
		
		label.addKeyListener(new MyKeyAdapter());
		add(label);
		setSize(500,300);
		setVisible(true);
		label.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971E4();
	}
	class MyKeyAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				text = text.substring(1) + text.substring(0,1);
				label.setText(text);
				break;
			default:
				break;
			}
		}
		
	}
	
}
