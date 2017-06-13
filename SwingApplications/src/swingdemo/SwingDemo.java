package swingdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo
{
	public SwingDemo(){
		JFrame obj = new JFrame("Hari Technologies");
		obj.setSize(500,100);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Welcome to Hari Technoogies");
		obj.add(label);
		obj.setVisible(true);
	}
}
