package student;
  public class Student {
	 int RollNumber;
	 String Name;
	 String Department;
	char section;
	static String collegename="KIET"; // class variable
	
	public Student(int RollNumber, String Name, String Department, char section) {
		this.RollNumber=RollNumber;
		this.Name=Name;
		this.Department=Department;
		this.section=section;
	}
	public Student() {
		this.RollNumber=3;
		this.Name="unknown";
		this.Department="AI";
		this.section='C';
	}
	public Student(Student obj) {
		this.RollNumber=obj.RollNumber;
		this.Name=obj.Name;
		this.Department=obj.Department;
		this.section=obj.section;
	}
	
	public void studying(int No_of_hours) {
		
		System.out.println("the student is studying for"+No_of_hours);
	}
	public void playing() {
		System.out.println("Student is Playing");
	}
	public void displayInfo() {
		System.out.println("the name of the student is"+Name + "the college name is"+collegename);
		System.out.println("The department is"+ Department+ "and section is"+section);
	}
	public void payFee() {
		System.out.println("The student"+Name+"has paid the tution fee");
		}
	

}
