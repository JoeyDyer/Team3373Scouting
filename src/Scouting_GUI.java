import java.awt.EventQueue;
import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JLabel;

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
		frame.setBounds(100, 100, 627, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{404, 224, 0};
		gridBagLayout.rowHeights = new int[]{16, 28, 16, 28, 0, 28, 28, 28, 28, 28, 28, 28, 28, 95, 29, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblTeamScoutingApplication = new JLabel("Team Scouting Application");
		GridBagConstraints gbc_lblTeamScoutingApplication = new GridBagConstraints();
		gbc_lblTeamScoutingApplication.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeamScoutingApplication.gridx = 0;
		gbc_lblTeamScoutingApplication.gridy = 0;
		frame.getContentPane().add(lblTeamScoutingApplication, gbc_lblTeamScoutingApplication);
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setText("Enter Your Name Here");
		GridBagConstraints gbc_txtEnterYourName = new GridBagConstraints();
		gbc_txtEnterYourName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterYourName.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterYourName.gridx = 0;
		gbc_txtEnterYourName.gridy = 1;
		frame.getContentPane().add(txtEnterYourName, gbc_txtEnterYourName);
		txtEnterYourName.setColumns(10);
		
		lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 0);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 1;
		frame.getContentPane().add(lblName, gbc_lblName);
		
		txtEnterMatchNumber = new JTextField();
		txtEnterMatchNumber.setText("Enter Match Number");
		GridBagConstraints gbc_txtEnterMatchNumber = new GridBagConstraints();
		gbc_txtEnterMatchNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMatchNumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterMatchNumber.gridx = 0;
		gbc_txtEnterMatchNumber.gridy = 2;
		frame.getContentPane().add(txtEnterMatchNumber, gbc_txtEnterMatchNumber);
		txtEnterMatchNumber.setColumns(10);
		
		lblMatch = new JLabel("Match");
		GridBagConstraints gbc_lblMatch = new GridBagConstraints();
		gbc_lblMatch.insets = new Insets(0, 0, 5, 0);
		gbc_lblMatch.gridx = 1;
		gbc_lblMatch.gridy = 2;
		frame.getContentPane().add(lblMatch, gbc_lblMatch);
		
		txtEnterTargetTeam = new JTextField();
		txtEnterTargetTeam.setText("Enter Target Team Number");
		GridBagConstraints gbc_txtEnterTargetTeam = new GridBagConstraints();
		gbc_txtEnterTargetTeam.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterTargetTeam.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterTargetTeam.gridx = 0;
		gbc_txtEnterTargetTeam.gridy = 3;
		frame.getContentPane().add(txtEnterTargetTeam, gbc_txtEnterTargetTeam);
		txtEnterTargetTeam.setColumns(10);
		
		lblTeamNumber = new JLabel("Team Number");
		GridBagConstraints gbc_lblTeamNumber = new GridBagConstraints();
		gbc_lblTeamNumber.insets = new Insets(0, 0, 5, 0);
		gbc_lblTeamNumber.gridx = 1;
		gbc_lblTeamNumber.gridy = 3;
		frame.getContentPane().add(lblTeamNumber, gbc_lblTeamNumber);
		
		txtEnterPointsScored = new JTextField();
		txtEnterPointsScored.setText("Enter Points Scored in Autonomous");
		GridBagConstraints gbc_txtEnterPointsScored = new GridBagConstraints();
		gbc_txtEnterPointsScored.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsScored.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsScored.gridx = 0;
		gbc_txtEnterPointsScored.gridy = 4;
		frame.getContentPane().add(txtEnterPointsScored, gbc_txtEnterPointsScored);
		txtEnterPointsScored.setColumns(10);
		
		lblAutonomousPoints = new JLabel("Autonomous Points");
		GridBagConstraints gbc_lblAutonomousPoints = new GridBagConstraints();
		gbc_lblAutonomousPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblAutonomousPoints.gridx = 1;
		gbc_lblAutonomousPoints.gridy = 4;
		frame.getContentPane().add(lblAutonomousPoints, gbc_lblAutonomousPoints);
		
		txtEnterPointsEarned = new JTextField();
		txtEnterPointsEarned.setText("Enter Points Earned by Tote Stacking");
		GridBagConstraints gbc_txtEnterPointsEarned = new GridBagConstraints();
		gbc_txtEnterPointsEarned.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned.gridx = 0;
		gbc_txtEnterPointsEarned.gridy = 5;
		frame.getContentPane().add(txtEnterPointsEarned, gbc_txtEnterPointsEarned);
		txtEnterPointsEarned.setColumns(10);
		
		lblTotePoints = new JLabel("Tote Points");
		GridBagConstraints gbc_lblTotePoints = new GridBagConstraints();
		gbc_lblTotePoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotePoints.gridx = 1;
		gbc_lblTotePoints.gridy = 5;
		frame.getContentPane().add(lblTotePoints, gbc_lblTotePoints);
		
		txtEnterMaximumHeight = new JTextField();
		txtEnterMaximumHeight.setText("Enter Maximum Height of Totes Stacked");
		GridBagConstraints gbc_txtEnterMaximumHeight = new GridBagConstraints();
		gbc_txtEnterMaximumHeight.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMaximumHeight.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterMaximumHeight.gridx = 0;
		gbc_txtEnterMaximumHeight.gridy = 6;
		frame.getContentPane().add(txtEnterMaximumHeight, gbc_txtEnterMaximumHeight);
		txtEnterMaximumHeight.setColumns(10);
		
		lblToteHeight = new JLabel("Tote Height");
		GridBagConstraints gbc_lblToteHeight = new GridBagConstraints();
		gbc_lblToteHeight.insets = new Insets(0, 0, 5, 0);
		gbc_lblToteHeight.gridx = 1;
		gbc_lblToteHeight.gridy = 6;
		frame.getContentPane().add(lblToteHeight, gbc_lblToteHeight);
		
		txtEnterPointsEarned_1 = new JTextField();
		txtEnterPointsEarned_1.setText("Enter Points Earned with Cans");
		GridBagConstraints gbc_txtEnterPointsEarned_1 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_1.gridx = 0;
		gbc_txtEnterPointsEarned_1.gridy = 7;
		frame.getContentPane().add(txtEnterPointsEarned_1, gbc_txtEnterPointsEarned_1);
		txtEnterPointsEarned_1.setColumns(10);
		
		lblCanPoints = new JLabel("Can Points");
		GridBagConstraints gbc_lblCanPoints = new GridBagConstraints();
		gbc_lblCanPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblCanPoints.gridx = 1;
		gbc_lblCanPoints.gridy = 7;
		frame.getContentPane().add(lblCanPoints, gbc_lblCanPoints);
		
		txtEnterMaximumHeight_1 = new JTextField();
		txtEnterMaximumHeight_1.setText("Enter Maximum Height of Stacked Cans");
		GridBagConstraints gbc_txtEnterMaximumHeight_1 = new GridBagConstraints();
		gbc_txtEnterMaximumHeight_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMaximumHeight_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterMaximumHeight_1.gridx = 0;
		gbc_txtEnterMaximumHeight_1.gridy = 8;
		frame.getContentPane().add(txtEnterMaximumHeight_1, gbc_txtEnterMaximumHeight_1);
		txtEnterMaximumHeight_1.setColumns(10);
		
		lblCanHeight = new JLabel("Can Height");
		GridBagConstraints gbc_lblCanHeight = new GridBagConstraints();
		gbc_lblCanHeight.insets = new Insets(0, 0, 5, 0);
		gbc_lblCanHeight.gridx = 1;
		gbc_lblCanHeight.gridy = 8;
		frame.getContentPane().add(lblCanHeight, gbc_lblCanHeight);
		
		txtEnterPointsEarned_2 = new JTextField();
		txtEnterPointsEarned_2.setText("Enter Points Earned by Litter");
		GridBagConstraints gbc_txtEnterPointsEarned_2 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_2.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_2.gridx = 0;
		gbc_txtEnterPointsEarned_2.gridy = 9;
		frame.getContentPane().add(txtEnterPointsEarned_2, gbc_txtEnterPointsEarned_2);
		txtEnterPointsEarned_2.setColumns(10);
		
		lblLitterPoints = new JLabel("Litter Points");
		GridBagConstraints gbc_lblLitterPoints = new GridBagConstraints();
		gbc_lblLitterPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblLitterPoints.gridx = 1;
		gbc_lblLitterPoints.gridy = 9;
		frame.getContentPane().add(lblLitterPoints, gbc_lblLitterPoints);
		
		txtEnterNumberOf = new JTextField();
		txtEnterNumberOf.setText("Enter Number of Totes Litter is Scored On");
		GridBagConstraints gbc_txtEnterNumberOf = new GridBagConstraints();
		gbc_txtEnterNumberOf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterNumberOf.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterNumberOf.gridx = 0;
		gbc_txtEnterNumberOf.gridy = 10;
		frame.getContentPane().add(txtEnterNumberOf, gbc_txtEnterNumberOf);
		txtEnterNumberOf.setColumns(10);
		
		lblLitterHeight = new JLabel("Litter Height");
		GridBagConstraints gbc_lblLitterHeight = new GridBagConstraints();
		gbc_lblLitterHeight.insets = new Insets(0, 0, 5, 0);
		gbc_lblLitterHeight.gridx = 1;
		gbc_lblLitterHeight.gridy = 10;
		frame.getContentPane().add(lblLitterHeight, gbc_lblLitterHeight);
		
		txtEnterPointsEarned_3 = new JTextField();
		txtEnterPointsEarned_3.setText("Enter Points Earned by Coopertition");
		GridBagConstraints gbc_txtEnterPointsEarned_3 = new GridBagConstraints();
		gbc_txtEnterPointsEarned_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterPointsEarned_3.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterPointsEarned_3.gridx = 0;
		gbc_txtEnterPointsEarned_3.gridy = 11;
		frame.getContentPane().add(txtEnterPointsEarned_3, gbc_txtEnterPointsEarned_3);
		txtEnterPointsEarned_3.setColumns(10);
		
		lblCoopertitionPoints = new JLabel("Coopertition Points");
		GridBagConstraints gbc_lblCoopertitionPoints = new GridBagConstraints();
		gbc_lblCoopertitionPoints.insets = new Insets(0, 0, 5, 0);
		gbc_lblCoopertitionPoints.gridx = 1;
		gbc_lblCoopertitionPoints.gridy = 11;
		frame.getContentPane().add(lblCoopertitionPoints, gbc_lblCoopertitionPoints);
		
		txtEnterAdditionalNotes = new JTextField();
		txtEnterAdditionalNotes.setText("Enter Additional Notes Here");
		GridBagConstraints gbc_txtEnterAdditionalNotes = new GridBagConstraints();
		gbc_txtEnterAdditionalNotes.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterAdditionalNotes.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterAdditionalNotes.gridx = 0;
		gbc_txtEnterAdditionalNotes.gridy = 12;
		frame.getContentPane().add(txtEnterAdditionalNotes, gbc_txtEnterAdditionalNotes);
		txtEnterAdditionalNotes.setColumns(10);
		
		lblAdditionalNotes = new JLabel("Additional Notes");
		GridBagConstraints gbc_lblAdditionalNotes = new GridBagConstraints();
		gbc_lblAdditionalNotes.insets = new Insets(0, 0, 5, 0);
		gbc_lblAdditionalNotes.gridx = 1;
		gbc_lblAdditionalNotes.gridy = 12;
		frame.getContentPane().add(lblAdditionalNotes, gbc_lblAdditionalNotes);
		
		btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSubmit.gridx = 0;
		gbc_btnSubmit.gridy = 14;
		frame.getContentPane().add(btnSubmit, gbc_btnSubmit);
		
		HandlerClass handler = new HandlerClass(txtEnterTargetTeam, txtEnterMatchNumber, txtEnterPointsEarned, txtEnterMaximumHeight, txtEnterPointsScored, txtEnterPointsEarned_1, txtEnterPointsEarned_2, txtEnterNumberOf, txtEnterPointsEarned_3, txtEnterAdditionalNotes, txtEnterYourName);
		btnSubmit.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener{
		private JTextField targetTeam;
		private JTextField matchNumber;
		private JTextField totePoints;
		private JTextField toteHeight;
		private JTextField autoPoints;
		private JTextField canPoints;
		private JTextField literPoints;
		private JTextField literHeight;
		private JTextField coopPoints;
		private JTextField addNotes;
		private JTextField scoutName;
	private HandlerClass(JTextField textfield1, JTextField textfield2, JTextField textfield3, JTextField textfield4, JTextField textfield5, JTextField textfield6, JTextField textfield8, JTextField textfield9, JTextField textfield10, JTextField textfield11, JTextField textfield12) {
			this.targetTeam = textfield1;
			this.matchNumber = textfield2;
			this.totePoints = textfield3;
			this.toteHeight = textfield4;
			this.autoPoints = textfield5;
			this.canPoints = textfield6;
			this.literPoints  = textfield8;
			this.literHeight = textfield9;
			this.coopPoints = textfield10;
			this.addNotes = textfield11;
			this.scoutName = textfield12;
		}
		public void actionPerformed(ActionEvent event){
			try{
				String index = Files.readAllLines(Paths.get("index.txt")).get(0);
				FileWriter  File = new FileWriter(index.toString() + "(" + targetTeam.getText() + ").txt");
				PrintWriter Printer = new PrintWriter(File);
				Printer.println("Team Number:"+ targetTeam.getText());
				Printer.println("Match Number:"+ matchNumber.getText());
				Printer.println("Teleop Tote Points Earned:"+ totePoints.getText());
				Printer.println("Maximum Tote Height:"+ toteHeight.getText());
				Printer.println("Autonomous points scored:"+ autoPoints.getText());
				Printer.println("Can stack points:"+ canPoints.getText());
				Printer.println("Maximum can stacking height:"+ gbc_txtEnterMaximumHeight_1);
				Printer.println("Litter points:"+ literPoints);
				Printer.println("Maximum Litter Height:"+ literHeight);
				Printer.println("Points earned by coopertition:"+ coopPoints);
				Printer.println("Additional Notes:"+ addNotes);
				Printer.println("Name of Scout:"+ gbc_txtEnterYourName);
				Printer.println("____________________________________");
				Printer.close();
				//Printer.println("Total Points:"+ total);
				Printer.close();
				int i = Integer.valueOf(index);
				i += 1;
				index = Integer.toString(i);
				Files.write(Paths.get("index.txt"), index.getBytes());
			} catch (IOException e){
				}
		}
	}
}
