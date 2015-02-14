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
			
			//Each set of info is 14 lines (1-12 used)
			
			try{
				ReadFile file = new ReadFile(file_name);
				String[] aryLines = file.OpenFile();
				int i;
				for(i=0; i < aryLines.length; i++ ){
				
					String[] bob = aryLines[i].split("");
				//	String a = bob.replaceAll("[^0-9]", "");
				/*	//String bobitoito = bob[i].replaceAll("[0-9]", "");
					String pomo = bob[i].replaceAll("[0-9]", "");
										//int[] bobito = new int[bob.length];
					int bobito = Integer.parseInt(pomo, bob.length);
										System.out.println(bobito);

					for(int n=0; n < aryLines.length; n++){
				*/		
						//bobito[n] = Integer.parseInt(aryLines[n]);
					}
					//int foo = Integer.parseInt(a);
					//String[] food = a.split(",");
					//System.out.println(food);
				//	System.out.println(bobito);
				//	String test = aryLines[i].replaceAll("[0-9]", "");
				/*	
				//	Scanner Scan2 = new Scanner(System.in);
					String line = Scan.next();
					String[] numberStrs = line.split(System.getProperty("line.separator"));
					//String[] numberStrs = line.split("a");

					int numbers[] = new int[numberStrs.length];
					for(int b = 0;b < numberStrs.length;b++)
					
				*/	   // Note that this is assuming valid input
					   // If you want to check then add a try/catch 
					   // and another index for the numbers if to continue adding the others
					  // numbers[b] = Integer.parseInt(numberStrs[b]);
					/*
					System.out.println(numbers[i]);
				*/
					//System.out.println(aryLines[i]);
//System.out.println(test);
 
					//String bob2 = aryLines[1];
					//String aryParsed[] = a;
					//String bob2 = a[1];
					//String a = bob.replaceAll("[^0-9]", "");
					//int foo = Integer.parseInt(a);
					//System.out.println(foo);
					//int gogogo = i-1;
					//System.out.println(i);
				
					String bob2 = aryLines[1];
					String b = bob2.replaceAll("[^0-9]", "");
					double foo2 = Integer.parseInt(b);
					String bob3 = aryLines[2];
					String c = bob3.replaceAll("[^0-9]", "");
					double foo3 = Integer.parseInt(c);
					String bob4 = aryLines[3];
					String d = bob4.replaceAll("[^0-9]", "");
					double foo4 = Integer.parseInt(d);
					String bob5 = aryLines[4];
					String e = bob3.replaceAll("[^0-9]", "");
					double foo5 = Integer.parseInt(e);
					String bob6 = aryLines[5];
					String f = bob6.replaceAll("[^0-9]", "");
					double foo6 = Integer.parseInt(f);
					System.out.println(foo5);
					System.out.println(foo6);
					String bob7 = aryLines[6];
					String g = bob3.replaceAll("[^0-9]", "");
					double foo7 = Integer.parseInt(g);
					System.out.println(foo7);
					String bob8 = aryLines[7];
					String j = bob8.replaceAll("[^0-9]", "");
					double foo8 = Integer.parseInt(j);
					System.out.println(foo8);
					String bob9 = aryLines[8];
					String k = bob3.replaceAll("[^0-9]", "");
					double foo9 = Integer.parseInt(k);
					String bob10 = aryLines[9];
					String l = bob3.replaceAll("[^0-9]", "");
					double foo10 = Integer.parseInt(l);
					String bob11 = aryLines[10];
					String m = bob11.replaceAll("[^0-9]", "");
					double foo11 = Integer.parseInt(m);
					String bob12 = aryLines[11];
					String n = bob12.replaceAll("[^0-9]", "");
					double foo12 = Integer.parseInt(n);
					String bob13 = aryLines[12];
					String o = bob13.replaceAll("[^0-9]", "");
					double foo13 = Integer.parseInt(o);
					String bob14 = aryLines[13];
					String p = bob14.replaceAll("[^0-9]", "");
					double foo14 = Integer.parseInt(p);
					System.out.println(foo2 + foo3 + foo4 + foo5 + foo6 + foo7 + foo8 + foo9 + foo10 + foo11 + foo12 + foo13 + foo14);
					//System.out.println(foo3);
				/*	
					String bob4 = aryLines[3];
					String d = bob4.replaceAll("[^0-9]", "");
					int foo4 = Integer.parseInt(d);
					System.out.println(foo4);
					String bob5 = aryLines[4];
					String e = bob5.replaceAll("[^0-9]", "");
					int foo5 = Integer.parseInt(d);
					System.out.println(foo5);
					//JOptionPane.showMessageDialog(null, foo + foo2 + foo3 + foo4 + foo5);
				*/	 
					 
				double averageTest = foo3/2 + foo2/2;
				System.out.println(averageTest);
				}
			
		
				catch (IOException e){
					System.out.println( e.getMessage());
					
				
	
				}
		}
	}		
}

