import java.util.Scanner;

public class Student {

	private String name;
	private int ticks;
	private int passingTicks;
	
	public Student() {
		details();

	}
	
	protected String getType() {
		return "Type";
	}
	



	Scanner input = new Scanner(System.in);
	
	public String toString() {
		return "\nName: " + getName() + "\nDepartment: " + getType() + 
				"\nPassing Ticks: " + getPassingTicks() + 
				"\nAquired Ticks: " + getTicks() + "\nRemarks: " + pass() + "\n--------------------\n\n";
	}
	
	public String getName() {
		return name;
	}
	public int getTicks() {
		return ticks;
	}
	public void setTicks(int ticks) {
		this.ticks = ticks;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getPassingTicks() {
		return passingTicks;
	}
	public void setPassingTicks(int passingTicks) {
		this.passingTicks = passingTicks;
	}
	
	
	
	public void details() {
		System.out.println("Enter your name: ");
		setName(input.nextLine());
		System.out.println("Enter no. of ticks: ");
		setTicks(input.nextInt());
		pass();
		
	}
	
	
	public boolean pass() {
		
		return getTicks() >= getPassingTicks();
	
	}
	
	
	
	
	
	
	
	
}
