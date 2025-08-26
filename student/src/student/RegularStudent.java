package student;

public class RegularStudent extends Student{
	int attend_per;
	String class_room;
	
	public RegularStudent(int RollNumber, String Name, String Department, char section, int attend_per, String class_room) {
		super(RollNumber, Name, Department,section);
		this.attend_per=attend_per;
		this.class_room=class_room;
	}
	public RegularStudent() {
		
	}
	public void submitAssignment() {
		System.out.println("The student has submitted the assignment in hard copy");
		
	}
	public void payFee() {
		super.payFee();
		System.out.println("The student in class room"+class_room+"has submitted the tution fee + lab fee + library fee");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("the class room is " +class_room+" and the attendance percentage is"+attend_per);
	}
	

}
