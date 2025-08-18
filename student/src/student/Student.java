package student;

public class Student {
	int RollNumber;
	String Name;
	String Department;
	char section;
	
	public void studying(int No_of_hours) {
		
		System.out.println("the student is studying for"+No_of_hours);
	}
	public void playing() {
		System.out.println("Student is Playing");
	}
	public void displayInfo() {
		System.out.println("the name of the student is"+Name );
	}
	public static void main(String args[]) {
		Student student1 = new Student();
		
		student1.Department="AI";
		student1.Name="Rohan";
		student1.RollNumber=1;
		student1.section='C';
		student1.displayInfo();
		student1.playing();
		student1.studying(5);
		//System.out.println(student1.total);
		
	}

}
