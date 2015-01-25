import java.io.FileWriter;
import java.io.IOException;
import java.io.*;


public class Index {

	public static void main(String[] args) {
		
		try{
		FileWriter File = new FileWriter("Java.txt");
		PrintWriter Printer = new PrintWriter(File);
		
		Printer.println("Did it work?");
		Printer.println("YES!!!!");
		
		Printer.close();
	} catch (IOException e) {
	}
}
}
