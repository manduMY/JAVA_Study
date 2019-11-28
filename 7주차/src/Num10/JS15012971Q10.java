package Num10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JS15012971Q10 extends JFrame{
	private JLabel[] gameLabel = new JLabel[10];
	private int press = 0;
	
	JS15012971Q10() {
		setTitle("11Àå 10¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		setSize(300,300);
		setVisible(true);
		
		for(int i=0;i<gameLabel.length;i++) {
			gameLabel[i] = new  JLabel(Integer.toString(i));
			gameLabel[i].setFont(new Font("Gothic",Font.PLAIN,15));
			gameLabel[i].setForeground(Color.MAGENTA);
			c.add(gameLabel[i]);
			
			gameLabel[i].addMouseListener(new MyMouseListener());
		}
		
		configure();
	}
	public void configure() {
		Container c = getContentPane();
		for(int i=0;i<gameLabel.length;i++) {
			gameLabel[i].setSize(15,15);
			
			int xBound = c.getWidth() - gameLabel[i].getWidth();
			int yBound = c.getHeight() - gameLabel[i].getHeight();

			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);
			
			gameLabel[i].setLocation(x,y);
			gameLabel[i].setVisible(true);
		}
	}
	class MyMouseListener extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JLabel la = (JLabel)e.getSource();
			if(Integer.parseInt(la.getText()) == press) {
				press++;
				if(press == 10) {
					press = 0;
					configure();
				} else {
					la.setVisible(false);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971Q10();
	}

}
