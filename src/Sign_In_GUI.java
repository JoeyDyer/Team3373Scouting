import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JEditorPane;






public class Sign_In_GUI {

	private JFrame frame;
	private JTextField txtPleaseEnterFirst;
	private JTextField txtPleaseEnterThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_In_GUI window = new Sign_In_GUI();
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
	public Sign_In_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 20, 147));
		frame.setBounds(100, 100, 559, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFrcTeam = new JLabel("FRC Team 3373 Sign In/Out Sheet");
		lblFrcTeam.setBounds(245, 0, 281, 21);
		lblFrcTeam.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		frame.getContentPane().add(lblFrcTeam);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(55, 32, 36, 16);
		frame.getContentPane().add(lblName);
		
		txtPleaseEnterFirst = new JTextField();
		txtPleaseEnterFirst.setBounds(213, 26, 346, 28);
		txtPleaseEnterFirst.setText("Please Enter First and Last Name Here");
		frame.getContentPane().add(txtPleaseEnterFirst);
		txtPleaseEnterFirst.setColumns(10);
		
		JLabel lblSignInout = new JLabel("Sign In/Out?");
		lblSignInout.setBounds(34, 152, 78, 16);
		frame.getContentPane().add(lblSignInout);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(387, 129, 122, 122);
		lblNewLabel_1.setIcon(new ImageIcon("rsz_robo_pink_burned.png"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(30, 208, 87, 29);
		frame.getContentPane().add(btnSignIn);		
		
		DateFormat txtPleaseEnterThe = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date txtPleaseEnterThe2 = new Date();
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(213, 208, 98, 29);
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnSignOut);
		btnSignIn.addActionListener(new Action(txtPleaseEnterFirst, txtPleaseEnterThe));
		btnSignOut.addActionListener(new Action.Actio(txtPleaseEnterFirst, txtPleaseEnterThe));
	}

		}
	 class Action implements ActionListener{
		private JTextField memberName;
		private DateFormat currentTime;
	public Action(JTextField textfield1, DateFormat textfield2) {
			this.memberName = textfield1;
			this.currentTime = textfield2;
	
}
		
		
		public void actionPerformed(ActionEvent e){
			GregorianCalendar date = new GregorianCalendar();
			int minute, hour;
			hour = date.get(Calendar.HOUR);
			minute = date.get(Calendar.MINUTE);
			FileWriter fStream;
			try{				
				fStream = new FileWriter("Present_Members.txt", true);
				fStream.append("IN:  " + memberName.getText() + "      " + hour + ":" + minute);
				fStream.append(System.getProperty("line.separator"));
				fStream.flush();
				fStream.close();
			//	PrintWriter Printer = new PrintWriter("Present_Members.txt");
				//Printer.println("Name:" + memberName.getText());
				//Printer.println("Time:" + currentTime.getText());
				//Printer.println("----------------------------------");
				//Printer.close();
				//Printer.println("Total Points:"+ total);
				//Printer.close();
			} catch (IOException Action){
				}
			JOptionPane.showMessageDialog(null, "Signed In! Welcome!");
			
		}
		
		static class Actio implements ActionListener{
			public JTextField memberName;
			public DateFormat currentTime;
		public Actio(JTextField textfield1, DateFormat textfield2) {
				this.memberName = textfield1;
				this.currentTime = textfield2;

	}
			public void actionPerformed(ActionEvent e){
				GregorianCalendar date = new GregorianCalendar();
				int minute, hour;
				hour = date.get(Calendar.HOUR);
				minute = date.get(Calendar.MINUTE);
				FileWriter fStream;
				try{				
					fStream = new FileWriter("Present_Members.txt", true);
					fStream.append("OUT: " + memberName.getText() + "      " + hour + ":" + minute);
					fStream.append(System.getProperty("line.separator"));
					fStream.flush();
					fStream.close();
				//	PrintWriter Printer = new PrintWriter("Present_Members.txt");
					//Printer.println("Name:" + memberName.getText());
					//Printer.println("Time:" + currentTime.getText());
					//Printer.println("----------------------------------");
					//Printer.close();
					//Printer.println("Total Points:"+ total);
					//Printer.close();
				} catch (IOException Action){
					}
				JOptionPane.showMessageDialog(null, "Signed Out! Come Back Soon!");
				
			
	}
		}
}