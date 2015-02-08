import java.io.FileWriter;
import java.io.IOException;
import java.io.*;


public class Index {

	public static void main(String[] args) {
		
		try{
		FileWriter File = new FileWriter("3373.txt");
		PrintWriter Printer = new PrintWriter(File);
		
		//Printer.println("1");
		
		Printer.close();
	} catch (IOException e) {
	}
}
}
