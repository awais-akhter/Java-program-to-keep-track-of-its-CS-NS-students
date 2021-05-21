import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		Student cs;
		Student ns;
		
		Scanner input = new Scanner(System.in);
		
		int choice;
		System.out.println("Select your department: 1. CS\t2. NS");
		choice = input.nextInt();
		
		do {
		switch (choice) {
		case 1:
			cs = new CsStudent();
			studentList.add(cs);
			System.out.println("Select your department: 1. CS\t2. NS\t3. End");
			choice = input.nextInt();
			break;
		case 2:
			ns = new NsStudent();
			studentList.add(ns);
			System.out.println("Select your department: 1. CS\t2. NS\t3. End");
			choice = input.nextInt();
			break;
		case 3:
			System.out.println("Select your department: 1. CS\t2. NS\t3. End");
			choice = input.nextInt();
			break;
		
		}
		} while (choice != 3);
		
		// Output
	    studentList.forEach(System.out::println);
		

	}

}
