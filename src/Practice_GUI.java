import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.lang.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice_GUI window = new Practice_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practice_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int x = 0, y = 0;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnButton = new JButton("Button");
		btnButton.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(btnButton);
		JLabel label2 = new JLabel();
		
		HandlerClass handler = new HandlerClass();
			btnButton.addActionListener(handler);
	}
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			JOptionPane.showMessageDialog(null, x);
			x = x + 1;
		}
	}

}
