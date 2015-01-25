import java.util.*;
import java.applet.*;
import java.io.*;
import static java.lang.System.*;

public class Text_Import {

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
