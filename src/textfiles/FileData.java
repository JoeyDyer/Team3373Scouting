package textfiles;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class FileData {

	public static void main(String[] args) throws IOException {
		boolean Comp = true;
		while(Comp){
			Scanner Scan = new Scanner(System.in);
			System.out.println("Enter Team Number");
			String Com = Scan.next();
			String file_name = Com+ ".txt";
			
			//Each set of info is 14 lines ( last 2 empty)
			
			try{
				ReadFile file = new ReadFile(file_name);
				String[] aryLines = file.OpenFile();
				int i;
				for(i=0; i < aryLines.length; i++ ){
					String bob = aryLines[i];
					String a = bob.replaceAll("[^0-9]", "");
					int foo = Integer.parseInt(a);
					System.out.println(foo);
					/*String bob2 = aryLines[1];				
					String bob = aryLines[i];
					//String a = bob.replaceAll("[^0-9]", "");
					//int foo = Integer.parseInt(a);
					//System.out.println(foo);
					int gogogo = i-1;
					System.out.println(i);
					/*
					String bob2 = aryLines[1];
					String b = bob2.replaceAll("[^0-9]", "");
					int foo2 = Integer.parseInt(b);
					//System.out.println(foo2);
					String bob3 = aryLines[2];
					String c = bob3.replaceAll("[^0-9]", "");
					int foo3 = Integer.parseInt(c);
					System.out.println(foo3);*/
					//System.out.println(foo3);
					String bob4 = aryLines[3];
					String d = bob4.replaceAll("[^0-9]", "");
					int foo4 = Integer.parseInt(d);
					//System.out.println(foo4);
					String bob5 = aryLines[4];
					String e = bob5.replaceAll("[^0-9]", "");
					int foo5 = Integer.parseInt(d);
					//System.out.println(foo5);
					//JOptionPane.showMessageDialog(null, foo + foo2 + foo3 + foo4 + foo5);
				
				}
			}
				catch (IOException e){
					System.out.println( e.getMessage());
					
					}
			}
		}
		
}
