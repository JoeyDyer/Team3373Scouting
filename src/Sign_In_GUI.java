import java.awt.EventQueue;
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

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(56, 95, 35, 16);
		frame.getContentPane().add(lblTime);
		
		txtPleaseEnterThe = new JTextField();
		txtPleaseEnterThe.setBounds(213, 89, 346, 28);
		txtPleaseEnterThe.setText("Please Enter the Current Time");
		frame.getContentPane().add(txtPleaseEnterThe);
		txtPleaseEnterThe.setColumns(10);
		
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
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(213, 208, 98, 29);
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnSignOut);
		
		 class MyFrame extends JFrame implements ActionListener {
			  public JButton btnSignIn = new JButton("Sign In");
			  public JButton btnSignOut = new JButton("Sign Out");

			  public MyFrame() {
			    btnSignIn.addActionListener(this);
			    btnSignOut.addActionListener(this);
			  }

			  public void actionPerformed(ActionEvent evt) {
			    Object src = evt.getSource();
			    if (src == btnSignIn) {
			    	JOptionPane.showMessageDialog(null, "POMASUPA \n IS THA \n BESTEREST?!?!?!");
			    } else if (src == btnSignOut) {
			    	JOptionPane.showMessageDialog(null, "NOOOOOOO!");
			    }
			  }
			}

		


}
}