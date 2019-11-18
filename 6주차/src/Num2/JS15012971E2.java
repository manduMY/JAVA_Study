package Num2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class JS15012971E2 extends JFrame{
	Container c = getContentPane();
	public JS15012971E2() {
		setTitle("2¹ø");
		setSize(400,200);
		setLayout(null);
		
		c.setBackground(Color.GREEN);
		c.addMouseMotionListener(new MyMouseListener());
		c.addMouseListener(new MyMouseAdapter());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971E2();
	}

	class MyMouseListener extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseMoved(e);
		}
	}
	class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseReleased(e);
			c.setBackground(Color.GREEN);
		}
		
	}
}
