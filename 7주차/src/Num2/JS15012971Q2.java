package Num2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JS15012971Q2 extends JFrame{
	
	JComboBox cb = new JComboBox();
	JTextField tf = new JTextField(15);
	JS15012971Q2() {
		setTitle("11Àå 2¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		Container c = getContentPane();
		
		tf.addKeyListener(new MyKeyListener());
		
		c.add(tf);	
		c.add(cb);
		
		setSize(500,500);
		setVisible(true);
	}

	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			
			int KeyCode = e.getKeyCode();
			
			if(KeyCode == e.VK_ENTER) {
				cb.addItem(tf.getText());
				tf.setText("");
			}
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971Q2();
	}
}
