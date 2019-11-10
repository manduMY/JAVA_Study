package Num6;
import java.awt.*;
import java.util.*;

import javax.swing.*;

public class JS15012971E06 extends JFrame{
	public JS15012971E06() {
		setTitle("¹®Á¦ 6¹ø");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		
		setLayout(null);
		Container c = getContentPane();
		
		for(int i=0;i<20;i++) {
			int randX = (int)(Math.random()*200) + 50;
			int randY = (int)(Math.random()*200) + 50;
			
			JLabel la = new JLabel((int)(Math.random()*100)+1+"");
			la.setLocation(randX,randY);
			la.setSize(10,10);
			la.setOpaque(true);
			la.setBackground(Color.RED);
			c.add(la);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971E06();
	}

}
