import java.util.Random;


public class Person {
	private String name;
	private String sex;
	private String goal; //fat loss, maintenance, muscle gain
	private int IDNumber;
	private int age;
	private int height;
	private int weight;
	private double aFV;
	
	public Person(String inName, String inSex, int inAge, int inHeight, int inWeight, String inGoal, double inAFV){
		
		name = inName;
		sex = inSex;
		goal = inGoal;
		age = inAge;
		height = inHeight;
		weight = inWeight;
		aFV = inAFV;
		
	}
	
	public String getName(){
		return name;
	}
	
	public String getSex(){
		return sex;
	}
	
	public String getGoal(){
		return goal;
	}
	public int getID(){
		return IDNumber;
	}
	public int getAge(){
		return age;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	public double getAFV(){
		return aFV; 
	}
	public String getAttributes(){
		return getName()+","+getID()+","+getSex()+","+getAge()+","+getHeight()+","+getWeight()+","+getGoal()+","+getAFV();
	}
	
	
}
