package Num4;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JS15012971Q4 extends JFrame{
	
	int[] unit = {50000,10000,1000,500,100,50,10,1};
	String[] str = {"금액","오만원","만원","천원","500원","100원","50원","10원","1원"};
	JLabel label;
	JTextField[] tf = new JTextField[str.length];
	JCheckBox[] cb = new JCheckBox[unit.length];
	JButton b;
	JS15012971Q4() {
		setTitle("11장 2번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Container c = getContentPane();
		c.setBackground(Color.PINK);
		
		label = new JLabel(str[0]);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setSize(50,20);
		label.setLocation(50,50);
		c.add(label);
		
		for(int i=1;i<str.length;i++) {
			label = new JLabel(str[i]);
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setSize(50,20);
			label.setLocation(50,100 + 20*i);
			c.add(label);
		}
		
		tf[0] = new JTextField(15);
		tf[0].setSize(100,20);
		tf[0].setLocation(120,50);
		c.add(tf[0]);
		
		for(int i=1;i<str.length;i++) {
			tf[i] = new JTextField(15);
			tf[i].setSize(100,20);
			tf[i].setLocation(120,100 + 20*i);
			c.add(tf[i]);
		}
		
		for(int i=0;i<cb.length;i++) {
			cb[i] = new JCheckBox();
			cb[i].setBackground(Color.PINK);
			cb[i].setSize(20,20);
			cb[i].setLocation(250,120 + 20*i);
			c.add(cb[i]);
		}
		b = new JButton("계산");
		b.addActionListener(new MyActionListener());
		b.setSize(70,20);
		b.setLocation(250,50);
		c.add(b);
		
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int input = Integer.parseInt(tf[0].getText());
			
			int m = 0;
			
			
			for(int i=0;i<unit.length;i++) {
				if(cb[i].isSelected()) {
					m=input/unit[i];
					tf[i+1].setText(Integer.toString(m));
					input %= unit[i];
				} else {
					tf[i+1].setText("0");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971Q4();
	}

}
