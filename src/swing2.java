import  javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
public class swing2 {

	public static void main(String[] args){
		
		
		JFrame frame = new JFrame("Test");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton("Butto");
		panel.add(button);
		button.addActionListener(new Action());
		
		JButton button2 = new JButton("Butto2");
		button2.addActionListener(new Action.Actio());
		panel.add(button2);
	}
		static class Action implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				JFrame wow = new JFrame("Hoi");
				wow.setVisible(true);
				wow.setSize(222,222);
				JLabel label = new JLabel("YAY!");
				JPanel panel = new JPanel();
				wow.add(panel);
				panel.add(label);
				
			}
			
			static class Actio implements ActionListener{
				
				public void actionPerformed(ActionEvent e){
					JFrame wow = new JFrame("Boi");
					wow.setVisible(true);
					wow.setSize(222,222);
					JLabel label = new JLabel("AWW!");
					JPanel panel = new JPanel();
					wow.add(panel);
					panel.add(label);
		}
		
		
		
		
		
			}
}
}
