import java.util.*;
import java.io.*;
public class ScoutingApp {

	public static void main(String[] args) {
		boolean restart =true;
		while(restart){
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name = in.nextLine();
		System.out.println("Enter Team Number");
		int team = in.nextInt();
		System.out.println("Enter Points earned by totes.");
		int totepoint = in.nextInt();
		System.out.println("Enter maximum totes stacked by team.");
		int toteheight = in.nextInt();
		System.out.println("Enter Autonomous points scored by the team.");
		int auto = in.nextInt();
		System.out.println("Enter can points.");
		int canpoints = in.nextInt();
		System.out.println("Enter maximum can height ontop of totes");
		int canheight = in.nextInt();
		System.out.println("Enter litter points");
		int litpoints = in.nextInt();
		System.out.println("Enter maximum height litter is put in the can by team.");
		int litheight = in.nextInt();
		System.out.println("Enter totes stacked for cooperation.");
		int coop = in.nextInt();
		System.out.println("Please enter additional Notes");
		Scanner notescan = new Scanner(System.in);
		String notes = notescan.nextLine();
		try{
			FileWriter  File = new FileWriter("Java.txt");
			FileReader Reader = new FileReader("Index.txt");
			PrintWriter Printer = new PrintWriter(File);
			Printer.println("Team Name:"+team);
			Printer.println("Teleop Tote Points Earned:"+totepoint);
			Printer.println("Maximum Tote Height:"+toteheight);
			Printer.println("Autonomous points scored"+auto);
			Printer.println("Can stack points:"+canpoints);
			Printer.println("Maximum can stacking height:"+canheight);
			Printer.println("Litter points:"+litpoints);
			Printer.println("Maximum Litter Height:"+litheight);
			Printer.println("Totes stacked for cooperation:"+coop);
			Printer.println("Additional Notes:"+notes);
			Printer.println("Name of Scout:"+ name);
			Printer.println("____________________________________");
			Printer.close();
		}catch (IOException e){
			}
		}
	}
}