package Package;
import java.util.*;

public class Tutorial5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 Person person1 = new Person("Sam", "banana");
		 System.out.println(person1.getGender());
		 person1.setEyeColor("purple");
		 System.out.println(person1.getEyecolor());
		 System.out.println(person1.name());
		 System.out.println(person1.name() + " is a " + person1.getGender() + " with " + person1.getEyecolor() + " eyes.");
	}

}
