import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Team_File_Creator {

	public static boolean go;
	public static String end = "end";
	
	public static void main(String[] args) {
		go = true;

		
		while(go=true){
			System.out.println("Enter team number:");
			Scanner scan = new Scanner(System.in);
			String teamNumber = scan.nextLine();
			if(teamNumber.equals(end)){
				go = false;
			}
			if(go=true){
		try{
		FileWriter File = new FileWriter(teamNumber +".txt");
		PrintWriter Printer = new PrintWriter(File);
		
		//Printer.println("1");
		
		Printer.close();
		if(teamNumber.equals(end)){
			go = false;
		}
	} catch (IOException e) {
	}
			}
}
	}
}
