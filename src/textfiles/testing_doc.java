package textfiles;

import java.io.*;

import javax.swing.JOptionPane;


public class testing_doc {

	public static void main(String[] args) {
		
		try{
		FileWriter File = new FileWriter("Test.txt");
		PrintWriter Printer = new PrintWriter(File);
		
		Printer.println("tay");
		Printer.println("dizm");
		Printer.println("ooh");
		Printer.println("we");
		Printer.println("nappie");
		Printer.println("boi");
		JOptionPane.showMessageDialog(null, "POMASUPA \n IS THA \n BESTEREST?!?!?!");
		
		Printer.close();
	} catch (IOException e) {
	}
}
}
