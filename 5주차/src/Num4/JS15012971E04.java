package Num4;

import java.awt.*;
import javax.swing.*;


public class JS15012971E04 extends JFrame{
	public JS15012971E04() {
		setTitle("¹®Á¦ 4¹ø");
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		
		for(int i=0;i<10;i++) {
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA,
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.setOpaque(true);
			b.setBackground(col[i]);
			c.add(b);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971E04();
	}

}
