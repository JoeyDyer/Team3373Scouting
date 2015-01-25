import java.util.*;
public class Pomasupa {
	
	public static void main(String[] args) {
		boolean playagain = true;
		while(playagain){
		Scanner in = new Scanner(System.in);
		System.out.println("Type 'Play' to play.");	
		String userName = in.next();
		if(userName.toUpperCase().equals("PLAY")){
			System.out.println("You wake up in a strange tavern in a strange town. \nAs you try to stand up you feel naseous and unfortunatly do not have any recollection of how you got there or who you are. \nYou stagger over to the bartender and ask about your location.\n'If you think I am going to help you at all after you what you did last night... You must be crazier than I thought'");
			System.out.println("You try to explain that you have no idea what he is talking about, but he does not care.\nYou now have to either threaten him or attempt to make amends.");
			String choice1 = in.next();
			if(choice1.toUpperCase().equals("THREATEN")|| choice1.toUpperCase().equals("THREATEN HIM")){
				System.out.println("You begin to attack the man, but guards of the town swiftly take you away.\nYou are now in prison.\nIn order to get out you must work choose to mine or cook or run for escape.");
				String choice2 = in.next();
				if(choice2.toUpperCase().equals("MINE")){
					System.out.println("You begin to crush rocks, but overhear some of the other prisoners planning escape. You may choose to either join or ignore them");
					String choice3 = in.next();
					if(choice3.toUpperCase().equals("JOIN")){
						System.out.println("You ask to join and they welcome you.\nThat night you begin to sneak out and climb the walls, but one of the guards sees your group and you see the guards begin to shoot arrows at you.\nYou manage to get over the wall, but many of your fellow prisoners are killed.\nYou need to make a quick decsion.\nWhich way are you going to go... East, North, South or West ");
						String choice4 = in.next();
						if(choice4.toUpperCase().equals("NORTH")){
							System.out.println("You run as fast as you can to the north.\nYou eventually end up near a farm.\nYou must now either choose to ask for hospitality or run past the farm./nNote: You are wanted for escaping the prison.");
							}
						if(choice4.toUpperCase().equals("SOUTH")){
							System.out.println("You run to the south, but soon realize how stupid you are...\nYou walked right back to the prison.\nYou are brought back to the prison and sentenced to be executed.");
							}
						if(choice4.toUpperCase().equals("EAST")){
							System.out.println("You run to East as fast as possible and come into a forest.\n Out of nowhere a bear mauls you and you die.\nDo you want to play again? Yes or No");
							String yesno3 = in.next();
							if(yesno3.toUpperCase().equals("NO")){
								playagain = false;
							}
						}
						}
					}
				if(choice2.toUpperCase().equals("RUN")){
					System.out.println("You run for the gate, but are instantly hit by a myriad of arrows.\nWould you like to play again?");
					String yesno1 = in.next();
					if(yesno1.toUpperCase().equals("NO")){
						System.out.println("Thanks for playing!");
						playagain = false;
					}
				}
					
				if(choice2.toUpperCase().equals("COOK")){
					System.out.println("You begin to cook a large bowl of the muck you are going to eat for lunch, but suddenly you drop the pot and ruin a huge amount of food.\nYou get kicked out of the kitchen and are forced to either mine or run for escape now.");
					String choice6 = in.next();
					if(choice6.toUpperCase().equals("RUN")){
						System.out.println("You run for the gate, but are instantly hit by a myriad of arrows.\nWould you like to play again?");
						String yesno2 = in.next();
						if(yesno2.toUpperCase().equals("NO")){
							System.out.println("Thanks for playing!");
							playagain = false;
				}

			
				}
			if(choice1.toUpperCase().equals("AMMENDS")||choice1.toUpperCase().equals("MAKE AMMENDS")){
				System.out.println("The bartender is still furious, but sees that you are trying to do right.\nHe shows you the horrible mess that you had made the night before");
			}
			if(userName.toUpperCase().equals("EXIT")){
				System.out.println("Bye, Thanks for Playing");
				playagain = false;
						}
					}
				}
			}
		}
	}
}