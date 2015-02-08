package textfiles;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class FileData {

	public static void main(String[] args) throws IOException {
		String file_name = "test.txt";
		
		
		
		try{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			int i;
			for(i=0; i < aryLines.length; i++ ){
				String bob = aryLines[0-9];
				String a = bob.replaceAll("[^0-9]", "");
				int foo = Integer.parseInt(a);
				System.out.println(foo);
				/*String bob2 = aryLines[1];
				String b = bob2.replaceAll("[^0-9]", "");
				int foo2 = Integer.parseInt(b);
				System.out.println(foo2);
				String bob3 = aryLines[2];
				String c = bob3.replaceAll("[^0-9]", "");
				int foo3 = Integer.parseInt(c);
				System.out.println(foo3);*/
			 
			
			}
		}
			catch (IOException e){
				System.out.println( e.getMessage());
				
				}
	}
}