package Package;
import java.util.*;


public class Person {
private String gender;
private String name;
private String eyeColor;


	public Person(String name){
		this.name = name;
		Random random = new Random();
		if(random.nextInt(2)==0){
			gender = "male";
		}
		else{
			gender = "female";
		}
	}
	
	public Person(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	public int numToes(){
		return 10;
	}
	
	public String name(){
		return name;
	}
	
	public void setEyeColor(String color){
		this.eyeColor = color;
	}
	public String getEyecolor(){
		return eyeColor;
	}
	public String getGender(){
		return gender;
	}

}
