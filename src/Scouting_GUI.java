import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.RenderedImage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.*;

import java.security.*;
import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.Font;

public class Scouting_GUI {

	public JFrame frame;
	public JTextField txtEnterYourName;
	public JTextField txtEnterMatchNumber;
	public JTextField txtEnterTargetTeam;
	public JTextField txtEnterPointsEarned;
	public JTextField txtEnterMaximumHeight;
	public JTextField txtEnterPointsScored;
	public JTextField txtEnterPointsEarned_1;
	public JTextField txtEnterMaximumHeight_1;
	public JTextField txtEnterPointsEarned_2;
	public JTextField txtEnterNumberOf;
	public JTextField txtEnterPointsEarned_3;
	public JButton btnSubmit;
	public JLabel lblName;
	public JLabel lblMatch;
	public JTextField txtEnterAdditionalNotes;
	public JLabel lblTeamNumber;
	public JLabel lblTotePoints;
	public JLabel lblToteHeight;
	public JLabel lblAutonomousPoints;
	public JLabel lblTeamScoutingApplication;
	public JLabel lblCanPoints;
	public JLabel lblCanHeight;
	public JLabel lblLitterPoints;
	public JLabel lblLitterHeight;
	public JLabel lblCoopertitionPoints;
	public JLabel lblAdditionalNotes;
	GridBagConstraints gbc_lblTeamScoutingApplication = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterYourName = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterTargetTeam = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterMatchNumber = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterPointsScored = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterPointsEarned = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterMaximumHeight = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterPointsEarned_1 = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterMaximumHeight_1 = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterPointsEarned_2 = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterNumberOf = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterAdditionalNotes = new GridBagConstraints();
	GridBagConstraints gbc_txtEnterPointsEarned_3 = new GridBagConstraints();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtTest;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scouting_GUI window = new Scouting_GUI();
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
	public Scouting_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(255, 20, 147));
		frame.setBounds(100, 100, 671, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 153, 230, 0, 71, 92, 0};
		gridBagLayout.rowHeights = new int[]{14, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 48, 23, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		lblTeamScoutingApplication = new JLabel("3373 Team Scouting Application");
		GridBagConstraints gbc_lblTeamScoutingApplication_1 = new GridBagConstraints();
		gbc_lblTeamScoutingApplication_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeamScoutingApplication_1.gridx = 2;
		gbc_lblTeamScoutingApplication_1.gridy = 0;
		frame.getContentPane().add(lblTeamScoutingApplication, gbc_lblTeamScoutingApplication_1);
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setText("Enter Your Name Here");
		GridBagConstraints gbc_txtEnterYourName_1 = new GridBagConstraints();
		gbc_txtEnterYourName_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterYourName_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterYourName_1.gridwidth = 3;
		gbc_txtEnterYourName_1.gridx = 0;
		gbc_txtEnterYourName_1.gridy = 1;
		frame.getContentPane().add(txtEnterYourName, gbc_txtEnterYourName_1);
		txtEnterYourName.setColumns(10);
		
		lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 0);
		gbc_lblName.gridx = 5;
		gbc_lblName.gridy = 1;
		frame.getContentPane().add(lblName, gbc_lblName);
		
		txtEnterMatchNumber = new JTextField();
		txtEnterMatchNumber.setText("Enter Match Number");
		GridBagConstraints gbc_txtEnterMatchNumber_1 = new GridBagConstraints();
		gbc_txtEnterMatchNumber_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMatchNumber_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterMatchNumber_1.gridwidth = 3;
		gbc_txtEnterMatchNumber_1.gridx = 0;
		gbc_txtEnterMatchNumber_1.gridy = 2;
		frame.getContentPane().add(txtEnterMatchNumber, gbc_txtEnterMatchNumber_1);
		txtEnterMatchNumber.setColumns(10);
		
		lblMatch = new JLabel("Match");
		GridBagConstraints gbc_lblMatch = new GridBagConstraints();
		gbc_lblMatch.insets = new Insets(0, 0, 5, 0);
		gbc_lblMatch.gridx = 5;
		gbc_lblMatch.gridy = 2;
		frame.getContentPane().add(lblMatch, gbc_lblMatch);
		
		//HandlerClass handler = new HandlerClass(txtEnterTargetTeam, txtEnterMatchNumber, txtEnterPointsEarned, txtEnterMaximumHeight, txtEnterPointsScored, txtEnterPointsEarned_1, txtEnterMaximumHeight_1, txtEnterPointsEarned_2, txtEnterNumberOf, txtEnterPointsEarned_3, txtEnterAdditionalNotes, txtEnterYourName);
		
		txtEnterTargetTeam = new JTextField();
		txtEnterTargetTeam.setEditable(true);
		txtEnterTargetTeam.setText("Enter Target Team Number");
		GridBagConstraints gbc_txtEnterTargetTeam_1 = new GridBagConstraints();
		gbc_txtEnterTargetTeam_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterTargetTeam_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterTargetTeam_1.gridwidth = 3;
		gbc_txtEnterTargetTeam_1.gridx = 0;
		gbc_txtEnterTargetTeam_1.gridy = 3;
		frame.getContentPane().add(txtEnterTargetTeam, gbc_txtEnterTargetTeam_1);
		txtEnterTargetTeam.setColumns(10);
		
		lblTeamNumber = new JLabel("Team Number");
		GridBagConstraints gbc_lblTeamNumber = new GridBagConstraints();
		gbc_lblTeamNumber.insets = new Insets(0, 0, 5, 0);
		gbc_lblTeamNumber.gridx = 5;
		gbc_lblTeamNumber.gridy = 3;
		frame.getContentPane().add(lblTeamNumber, gbc_lblTeamNumber);
		
		int vara = 0;
		int varb = 0;
		int varc = 0;
		int vard = 0;
		int vare = 0;
		int varf = 0;
		int varg = 0;
		int varh = 0;

		
		txtEnterPointsScored = new JTextField();
		txtEnterPointsScored.setEditable(false);
		txtEnterPointsScored.setText("" + vara);
		GridBagConstraints gbc_txtEnterPointsScored_1 = new GridBagConstraints();
		gbc_txtEnterPointsScored_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsScored_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsScored_1.gridwidth = 3;
		gbc_txtEnterPointsScored_1.gridx = 0;
		gbc_txtEnterPointsScored_1.gridy = 4;
		frame.getContentPane().add(txtEnterPointsScored, gbc_txtEnterPointsScored_1);
		txtEnterPointsScored.setColumns(10);
		
		button = new JButton("+");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 4;
		frame.getContentPane().add(button, gbc_button);
		
		button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 4;
		gbc_button_1.gridy = 4;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		lblAutonomousPoints = new JLabel("Autonomous Points");
		GridBagConstraints gbc_lblAutonomousPoints = new GridBagConstraints();
		gbc_lblAutonomousPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblAutonomousPoints.gridx = 5;
		gbc_lblAutonomousPoints.gridy = 4;
		frame.getContentPane().add(lblAutonomousPoints, gbc_lblAutonomousPoints);
		
		txtEnterPointsEarned = new JTextField();
		txtEnterPointsEarned.setEditable(false);
		txtEnterPointsEarned.setText("" + varb);
		GridBagConstraints gbc_txtEnterPointsEarned_4 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_4.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_4.gridwidth = 3;
		gbc_txtEnterPointsEarned_4.gridx = 0;
		gbc_txtEnterPointsEarned_4.gridy = 5;
		frame.getContentPane().add(txtEnterPointsEarned, gbc_txtEnterPointsEarned_4);
		txtEnterPointsEarned.setColumns(10);
		
		button_2 = new JButton("+");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 5;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		button_3 = new JButton("-");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 4;
		gbc_button_3.gridy = 5;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		lblTotePoints = new JLabel("Tote Points");
		GridBagConstraints gbc_lblTotePoints = new GridBagConstraints();
		gbc_lblTotePoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotePoints.gridx = 5;
		gbc_lblTotePoints.gridy = 5;
		frame.getContentPane().add(lblTotePoints, gbc_lblTotePoints);
		
		txtEnterMaximumHeight = new JTextField();
		txtEnterMaximumHeight.setEditable(false);
		txtEnterMaximumHeight.setText("" + varc);
		GridBagConstraints gbc_txtEnterMaximumHeight_2 = new GridBagConstraints();
		gbc_txtEnterMaximumHeight_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMaximumHeight_2.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterMaximumHeight_2.gridwidth = 3;
		gbc_txtEnterMaximumHeight_2.gridx = 0;
		gbc_txtEnterMaximumHeight_2.gridy = 6;
		frame.getContentPane().add(txtEnterMaximumHeight, gbc_txtEnterMaximumHeight_2);
		txtEnterMaximumHeight.setColumns(10);
		
		button_4 = new JButton("+");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 3;
		gbc_button_4.gridy = 6;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		button_5 = new JButton("-");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 4;
		gbc_button_5.gridy = 6;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		lblToteHeight = new JLabel("Tote Height");
		GridBagConstraints gbc_lblToteHeight = new GridBagConstraints();
		gbc_lblToteHeight.insets = new Insets(0, 0, 5, 0);
		gbc_lblToteHeight.gridx = 5;
		gbc_lblToteHeight.gridy = 6;
		frame.getContentPane().add(lblToteHeight, gbc_lblToteHeight);
		
		txtEnterPointsEarned_1 = new JTextField();
		txtEnterPointsEarned_1.setEditable(false);
		txtEnterPointsEarned_1.setText("" + vard);
		GridBagConstraints gbc_txtEnterPointsEarned_1_1 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_1_1.gridwidth = 3;
		gbc_txtEnterPointsEarned_1_1.gridx = 0;
		gbc_txtEnterPointsEarned_1_1.gridy = 7;
		frame.getContentPane().add(txtEnterPointsEarned_1, gbc_txtEnterPointsEarned_1_1);
		txtEnterPointsEarned_1.setColumns(10);
		
		button_6 = new JButton("+");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 3;
		gbc_button_6.gridy = 7;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		button_7 = new JButton("-");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 4;
		gbc_button_7.gridy = 7;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		lblCanPoints = new JLabel("Can Points");
		GridBagConstraints gbc_lblCanPoints = new GridBagConstraints();
		gbc_lblCanPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblCanPoints.gridx = 5;
		gbc_lblCanPoints.gridy = 7;
		frame.getContentPane().add(lblCanPoints, gbc_lblCanPoints);
		
		txtEnterMaximumHeight_1 = new JTextField();
		txtEnterMaximumHeight_1.setEditable(false);
		txtEnterMaximumHeight_1.setText("" + vare);
		GridBagConstraints gbc_txtEnterMaximumHeight_1_1 = new GridBagConstraints();
		gbc_txtEnterMaximumHeight_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMaximumHeight_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterMaximumHeight_1_1.gridwidth = 3;
		gbc_txtEnterMaximumHeight_1_1.gridx = 0;
		gbc_txtEnterMaximumHeight_1_1.gridy = 8;
		frame.getContentPane().add(txtEnterMaximumHeight_1, gbc_txtEnterMaximumHeight_1_1);
		txtEnterMaximumHeight_1.setColumns(10);
		
		button_8 = new JButton("+");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 3;
		gbc_button_8.gridy = 8;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		button_9 = new JButton("-");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 4;
		gbc_button_9.gridy = 8;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		lblCanHeight = new JLabel("Can Height");
		GridBagConstraints gbc_lblCanHeight = new GridBagConstraints();
		gbc_lblCanHeight.insets = new Insets(0, 0, 5, 0);
		gbc_lblCanHeight.gridx = 5;
		gbc_lblCanHeight.gridy = 8;
		frame.getContentPane().add(lblCanHeight, gbc_lblCanHeight);
		
		txtEnterPointsEarned_2 = new JTextField();
		txtEnterPointsEarned_2.setEditable(false);
		txtEnterPointsEarned_2.setText("" + varf);
		GridBagConstraints gbc_txtEnterPointsEarned_2_1 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_2_1.gridwidth = 3;
		gbc_txtEnterPointsEarned_2_1.gridx = 0;
		gbc_txtEnterPointsEarned_2_1.gridy = 9;
		frame.getContentPane().add(txtEnterPointsEarned_2, gbc_txtEnterPointsEarned_2_1);
		txtEnterPointsEarned_2.setColumns(10);
		
		button_10 = new JButton("+");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 3;
		gbc_button_10.gridy = 9;
		frame.getContentPane().add(button_10, gbc_button_10);
		
		button_11 = new JButton("-");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 4;
		gbc_button_11.gridy = 9;
		frame.getContentPane().add(button_11, gbc_button_11);
		
		lblLitterPoints = new JLabel("Litter Points");
		GridBagConstraints gbc_lblLitterPoints = new GridBagConstraints();
		gbc_lblLitterPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblLitterPoints.gridx = 5;
		gbc_lblLitterPoints.gridy = 9;
		frame.getContentPane().add(lblLitterPoints, gbc_lblLitterPoints);
		
		txtEnterNumberOf = new JTextField();
		txtEnterNumberOf.setEditable(false);
		txtEnterNumberOf.setBackground(Color.WHITE);
		txtEnterNumberOf.setText("" + varg);
		GridBagConstraints gbc_txtEnterNumberOf_1 = new GridBagConstraints();
		gbc_txtEnterNumberOf_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterNumberOf_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterNumberOf_1.gridwidth = 3;
		gbc_txtEnterNumberOf_1.gridx = 0;
		gbc_txtEnterNumberOf_1.gridy = 10;
		frame.getContentPane().add(txtEnterNumberOf, gbc_txtEnterNumberOf_1);
		txtEnterNumberOf.setColumns(10);
		
		button_12 = new JButton("+");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 3;
		gbc_button_12.gridy = 10;
		frame.getContentPane().add(button_12, gbc_button_12);
		
		button_13 = new JButton("-");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 4;
		gbc_button_13.gridy = 10;
		frame.getContentPane().add(button_13, gbc_button_13);
		
		lblLitterHeight = new JLabel("Litter Height");
		GridBagConstraints gbc_lblLitterHeight = new GridBagConstraints();
		gbc_lblLitterHeight.insets = new Insets(0, 0, 5, 0);
		gbc_lblLitterHeight.gridx = 5;
		gbc_lblLitterHeight.gridy = 10;
		frame.getContentPane().add(lblLitterHeight, gbc_lblLitterHeight);
		
		txtEnterPointsEarned_3 = new JTextField();
		txtEnterPointsEarned_3.setEditable(false);
		txtEnterPointsEarned_3.setBackground(Color.WHITE);
		txtEnterPointsEarned_3.setText("" + varh);
		GridBagConstraints gbc_txtEnterPointsEarned_3_1 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_3_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_3_1.gridwidth = 3;
		gbc_txtEnterPointsEarned_3_1.gridx = 0;
		gbc_txtEnterPointsEarned_3_1.gridy = 11;
		frame.getContentPane().add(txtEnterPointsEarned_3, gbc_txtEnterPointsEarned_3_1);
		txtEnterPointsEarned_3.setColumns(10);
		
		button_14 = new JButton("+");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 3;
		gbc_button_14.gridy = 11;
		frame.getContentPane().add(button_14, gbc_button_14);
		
		button_15 = new JButton("-");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 4;
		gbc_button_15.gridy = 11;
		frame.getContentPane().add(button_15, gbc_button_15);
		
		lblCoopertitionPoints = new JLabel("Coopertition Points");
		GridBagConstraints gbc_lblCoopertitionPoints = new GridBagConstraints();
		gbc_lblCoopertitionPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblCoopertitionPoints.gridx = 5;
		gbc_lblCoopertitionPoints.gridy = 11;
		frame.getContentPane().add(lblCoopertitionPoints, gbc_lblCoopertitionPoints);
		
		txtEnterAdditionalNotes = new JTextField();
		txtEnterAdditionalNotes.setEditable(true);
		txtEnterAdditionalNotes.setBackground(Color.WHITE);
		txtEnterAdditionalNotes.setText("Enter Additional Notes Here");
		GridBagConstraints gbc_txtEnterAdditionalNotes_1 = new GridBagConstraints();
		gbc_txtEnterAdditionalNotes_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterAdditionalNotes_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterAdditionalNotes_1.gridwidth = 3;
		gbc_txtEnterAdditionalNotes_1.gridx = 0;
		gbc_txtEnterAdditionalNotes_1.gridy = 12;
		frame.getContentPane().add(txtEnterAdditionalNotes, gbc_txtEnterAdditionalNotes_1);
		txtEnterAdditionalNotes.setColumns(10);
		
		lblAdditionalNotes = new JLabel("Additional Notes");
		GridBagConstraints gbc_lblAdditionalNotes = new GridBagConstraints();
		gbc_lblAdditionalNotes.insets = new Insets(0, 0, 5, 0);
		gbc_lblAdditionalNotes.gridx = 5;
		gbc_lblAdditionalNotes.gridy = 12;
		frame.getContentPane().add(lblAdditionalNotes, gbc_lblAdditionalNotes);
		

		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("rsz_robo_pink_burned.png"));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 13;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		HandlerClass handler = new HandlerClass(txtEnterTargetTeam, txtEnterMatchNumber, txtEnterPointsEarned, txtEnterMaximumHeight, txtEnterPointsScored, txtEnterPointsEarned_1, txtEnterMaximumHeight_1, txtEnterPointsEarned_2, txtEnterNumberOf, txtEnterPointsEarned_3, txtEnterAdditionalNotes, txtEnterYourName);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubmit.gridwidth = 3;
		gbc_btnSubmit.gridx = 0;
		gbc_btnSubmit.gridy = 14;
		frame.getContentPane().add(btnSubmit, gbc_btnSubmit);
		btnSubmit.addActionListener(handler);
		

	
		
		button.addActionListener(new Plus1(1,2,3,4,5,6,7,8,txtEnterPointsScored, txtEnterPointsScored));
		button_1.addActionListener(new Minus1(1,2,3,4,5,6,7,8,txtEnterPointsScored, txtEnterPointsScored));
		/*
		button_2.addActionListener(new Plus2(1,2,3,4,5,6,7,8));
		button_3.addActionListener(new Minus2(1,2,3,4,5,6,7,8));
		button_4.addActionListener(new Plus3(1,2,3,4,5,6,7,8));
		button_5.addActionListener(new Minus3(1,2,3,4,5,6,7,8));
		button_6.addActionListener(new Plus4(1,2,3,4,5,6,7,8));
		button_7.addActionListener(new Minus4(1,2,3,4,5,6,7,8));
		button_8.addActionListener(new Plus5(1,2,3,4,5,6,7,8));
		button_9.addActionListener(new Minus5(1,2,3,4,5,6,7,8));
		button_10.addActionListener(new Plus6(1,2,3,4,5,6,7,8));
		button_11.addActionListener(new Minus6(1,2,3,4,5,6,7,8));
		button_12.addActionListener(new Plus7(1,2,3,4,5,6,7,8));
		button_13.addActionListener(new Minus7(1,2,3,4,5,6,7,8));
		button_14.addActionListener(new Plus8(1,2,3,4,5,6,7,8));
		button_15.addActionListener(new Minus8(1,2,3,4,5,6,7,8));		
*/
	}
	
		class HandlerClass implements ActionListener{
			private JTextField targetTeam;
			private JTextField matchNumber;
			private JTextField totePoints;
			private JTextField toteHeight;
			private JTextField autoPoints;
			private JTextField canPoints;
			private JTextField canHeight;
			private JTextField literPoints;
			private JTextField literHeight;
			private JTextField coopPoints;
			private JTextField addNotes;
			private JTextField scoutName;
		private HandlerClass(JTextField textfield1, JTextField textfield2, JTextField textfield3, JTextField textfield4, JTextField textfield5, JTextField textfield6, JTextField textfield7, JTextField textfield8, JTextField textfield9, JTextField textfield10, JTextField textfield11, JTextField textfield12) {
				this.targetTeam = textfield1;
				this.matchNumber = textfield2;
				this.totePoints = textfield3;
				this.toteHeight = textfield4;
				this.autoPoints = textfield5;
				this.canPoints = textfield6;
				this.canHeight = textfield7;
				this.literPoints  = textfield8;
				this.literHeight = textfield9;
				this.coopPoints = textfield10;
				this.addNotes = textfield11;
				this.scoutName = textfield12;
			}
			public void actionPerformed(ActionEvent event){
				try{
					String index = Files.readAllLines(Paths.get("index.txt")).get(0);
					FileWriter  File = new FileWriter(matchNumber.getText() + "(" + targetTeam.getText() + ").txt");
					PrintWriter Printer = new PrintWriter(File);
					Printer.println("Team Number:"+ targetTeam.getText());
					Printer.println("Match Number:"+ matchNumber.getText());
					Printer.println("Teleop Tote Points Earned:"+ totePoints.getText());
					Printer.println("Maximum Tote Height:"+ toteHeight.getText());
					Printer.println("Autonomous points scored:"+ autoPoints.getText());
					Printer.println("Can stack points:"+ canPoints.getText());
					Printer.println("Maximum can stacking height:"+ canHeight.getText());
					Printer.println("Litter points:"+ literPoints.getText());
					Printer.println("Maximum Litter Height:"+ literHeight.getText());
					Printer.println("Points earned by coopertition:"+ coopPoints.getText());
					Printer.println("Additional Notes:"+ addNotes.getText());
					Printer.println("Name of Scout:"+ scoutName.getText());
					Printer.println("____________________________________");
					Printer.close();
					//Printer.println("Total Points:"+ total);
					Printer.close();
					int i = Integer.valueOf(index);
					i += 1;
					index = Integer.toString(i);
					Files.write(Paths.get("index.txt"), index.getBytes());
					//int num = 0;
				} catch (IOException e){
					}
				JOptionPane.showMessageDialog(null, "Scout Sheet Submitted. Thank you!");
			}
		}	
	
	
		
	class Plus1 implements ActionListener{
		private int va;
		private int vb;
		private int vc;
		private int vd;
		private int ve;
		private int vf;
		private int vg;
		private int vh;
		private JTextField num2;
		private JTextField te;
		private Plus1(int a, int b, int c, int d, int e, int f, int g, int h, JTextField num, JTextField tf1){
			a= this.va;
			this.vb = b;
			this.vc = c;
			this.vd = d;
			this.ve = e;
			this.vf = f;
			this.vg = g;
			this.vh = h;
			this.num2 = num;
			this.te = tf1;



			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String bob = (num2.getText()).toString();
			int foo = Integer.parseInt(bob);
			foo = foo+1;
			//int bob2 = ((Integer) bob);
			String bob2 = bob.replaceFirst(".*?(//d+).*", "$1");
			te.setText(((Integer)foo).toString());
			
		}
		
	}

	class Minus1 implements ActionListener{
		private int va;
		private int vb;
		private int vc;
		private int vd;
		private int ve;
		private int vf;
		private int vg;
		private int vh;
		private JTextField num2;
		private JTextField te;
		private Minus1(int a, int b, int c, int d, int e, int f, int g, int h, JTextField num, JTextField tf1){
			a= this.va;
			this.vb = b;
			this.vc = c;
			this.vd = d;
			this.ve = e;
			this.vf = f;
			this.vg = g;
			this.vh = h;
			this.num2 = num;
			this.te = tf1;

		
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String bob = (num2.getText()).toString();
			int foo = Integer.parseInt(bob);
			foo = foo-1;
			//int bob2 = ((Integer) bob);
			String bob2 = bob.replaceFirst(".*?(//d+).*", "$1");
			te.setText(((Integer)foo).toString());

			
			
		}

		
	}
}



