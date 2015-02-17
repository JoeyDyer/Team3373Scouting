package Package;
import java.util.*;

public class Tutorial4 {
	
	static double money;
	static String userName;
	static Scanner in = new Scanner(System.in);
	static Random random = new Random();
	
	
	public static void main(String[] args) {
		System.out.println("Please enter your username");
		money = 1000;
		userName = in.nextLine();
		System.out.println("Welcome " + userName + "!");
		rollDice();
	}
	
	public static void rollDice(){
		System.out.println("You have: $" + money);
		System.out.println("What number would you like to bet on? (2-12)");

			 int betRoll = in.nextInt();

		 
		 System.out.println("How much would you like to bet?");

			 double betMoney = in.nextInt();

		 while (betMoney > money){
			 System.out.println("You don't have $" + betMoney + "! You have $" + money+"!");
			 System.out.println("Please enter your bet again.");
			 betMoney = in.nextInt();
		 }
		 int dice;
		 dice = random.nextInt(6)+1;
		 int dice2;
		 dice2 = random.nextInt(6+1);
		int roll = dice + dice2;
		 if(betRoll == roll){
			 System.out.println("You have won! You win: $" + betMoney*10 +"!");
			 money += betMoney*10;
		 }
		 else{
			 money -= betMoney;
			 System.out.println("You lost, you loser! You're such a failiure! WOW! Now you only have $" + money);

		 }
		 
		 if(money <=0){
			 System.out.println("You are broke! YOU NEED TO GO DIE! GET HIT BY A BUS! AND A TRAIN!!!! AT THE SAME TIME!");
		 }
		 else{
			 rollDice();
		 }
		 
	}

}
