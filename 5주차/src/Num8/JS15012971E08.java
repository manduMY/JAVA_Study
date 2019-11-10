package Num8;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.GRAY);
		add(new JButton("Open"));
		add(new JButton("Close"));
		add(new JButton("Exit"));
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		
		setLayout(null);
		
		for(int i=0;i<15;i++) {
			int x = (int)(Math.random()*300)+1;
			int y = (int)(Math.random()*300)+1;
			
			JLabel la = new JLabel("*");
			la.setLocation(x,y);
			la.setSize(20,20);
			la.setOpaque(true);
			la.setForeground(Color.GREEN);
			add(la);
		}
	}
}
class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.YELLOW);
		add(new JButton("integer Input"));
		add(new TextField(15));
	}
}
public class JS15012971E08 extends JFrame{
	JS15012971E08() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		
		
		NorthPanel NP = new NorthPanel();
		add(NP,BorderLayout.NORTH);
		
		CenterPanel CP = new CenterPanel();
		add(CP,BorderLayout.CENTER);
		
		SouthPanel SP = new SouthPanel();
		add(SP,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971E08();	
	}
}