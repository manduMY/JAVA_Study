package Num6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;

public class JS15012971Q6 extends JFrame{
	JLabel label;
	JTextArea ta;
	JSlider sl;
	JS15012971Q6() {
		setTitle("11Àå 6¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Container c = getContentPane();
		
		ta = new JTextArea(10,10);
		
		sl = new JSlider(0,100);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JSlider sl = (JSlider)e.getSource();
				if(ta.getText().length() <= sl.getValue()) {
					sl.setValue(ta.getText().length());
				} else {
					try {
						ta.setText(ta.getText(0,sl.getValue()));
					} catch(BadLocationException ex) {}
				}
			}
		});
		
		ta.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				JTextArea ta = (JTextArea)e.getSource();
				int size = ta.getText().length();
				try {
					if(size>=100) {
						ta.setText(ta.getText(0,100));
					}
				}catch(BadLocationException ex) {}
				sl.setValue(size);
			}
			
		});
		
		c.add(sl, BorderLayout.SOUTH);
		c.add(ta, BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JS15012971Q6();
	}

}
