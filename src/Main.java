import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;



public class Main {
	
	static ArrayList<Person> people;

	public static void main(String[] args) throws FileNotFoundException{
		
		Person A = new Person("Bob", "Male", 20, 170, 65, "Fat Loss", 0.4);
		people = new ArrayList<Person>();
		people.add(A);
		
		createCSV();
		
	}
	
	public static void createCSV() throws FileNotFoundException{

		
		
		PrintWriter pw = new PrintWriter(new File("test.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("Name,ID,Age,Height,Weight,Goal,Age,AFV\n"); //first row
        for (Person a : people){
        	sb.append(a.getAttributes()+"\n");
        }

        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
		
	}

}
