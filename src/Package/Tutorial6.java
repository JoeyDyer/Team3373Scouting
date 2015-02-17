package Package;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Tutorial6 {

	public static void main(String[] args) {
		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("What would you like the filename to be?");
			String output = input.nextLine();
			if(!output.contains(".txt")){
				output += ".txt";
			}
			PrintWriter out = new PrintWriter(output);
			System.out.println("What would you like to print to the file?");
			String fileContents = input.nextLine();
			out.println(fileContents);
			out.close();
			Scanner fromFile = new Scanner(new File(output));
			System.out.println("The file " + output + " contains: ");
			while(fromFile.hasNextLine()){
				System.out.println(fromFile.nextLine());
			}
			System.out.println(System.getProperty("line.separator"));
			System.out.println("Finished reading and writing the file " + output+ ".");
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
