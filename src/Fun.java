import javax.swing.JOptionPane;

import java.applet.*;
import java.net.*;
import java.util.Scanner;

public class Fun {

	public static void main(String[] args) {
		//String word = "Bobito";
		//JOptionPane.showMessageDialog(null, word);
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome. Please enter your username.");
		String username = in.nextLine();
		System.out.println("Welcome " + username + "! Please enter your password!");
		String password = in.nextLine();
		String correct = "Bob";
		if(password.equals(correct)){
		System.out.println("Greetings, " + username + "! You are authorized. What would you like to do?");
		System.out.println("Logout OR Send Email");}
		else
			System.out.println("Access Denied!");
		String Action1 = in.nextLine();
		if(Action1.toUpperCase().equals("LOGOUT")){
		}
		if(Action1.toUpperCase().equals("EMAIL")){
			System.out.println("Who would you like to send an email to?");
		String To = in.nextLine();
		System.out.println("What would you like to say to " + To +"?");
		String Message = in.nextLine();
		System.out.println("Your message: \n Dear " + To + (", \n"   ) + Message + ("\n   Sincerely, ") + username);
	}
		if(Action1.toUpperCase().equals("SEND EMAIL")){
			System.out.println("Who would you like to send an email to?");
		String To = in.nextLine();
		System.out.println("What would you like to say to " + To +"?");
		String Message = in.nextLine();
		System.out.println("Your message: \n Dear " + To + (", \n"   ) + Message + ("\n   Sincerely, ") + username);
		/**
		try{
			*AudioClip clip = Applet.newAudioClip(new URL("file://Macintosh HD ▸ Users ▸ alexanderiasso ▸ Documents ▸ workspace ▸ Practicing"));
			*		clip.play();
		*} catch (MalformedURLException murle) {
			*System.out.println(murle);
			*/
		
		}
}
}

